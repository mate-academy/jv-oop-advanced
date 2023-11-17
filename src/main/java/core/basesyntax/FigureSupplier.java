package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static String DEFAULT_COLOR = Color.WHITE.name();
    private final static int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int numberOfFigureTypes = 5;
        int figureType = random.nextInt(numberOfFigureTypes);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0 :
                return new Circle(color, random.nextDouble() * 100);
            case 1 :
                return new Square(color, random.nextDouble() * 100);
            case 2 :
                return new Rectangle(color, random.nextDouble() * 100, random.nextDouble() * 100);
            case 3 :
                return new RightTriangle(color, random.nextDouble() * 100,
                        random.nextDouble() * 100);
            case 4 :
                double baseOne = random.nextDouble() * 100;
                double baseTwo = random.nextDouble() * 100;
                while (baseTwo == baseOne) {
                    baseTwo = random.nextDouble() * 100;
                }
                return new IsoscelesTrapezoid(color, baseOne, baseTwo, random.nextDouble() * 100);
            default :
                getDefaultFigure();
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
