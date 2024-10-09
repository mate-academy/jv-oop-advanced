package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();

    public BaseEntity getRandomFigure() {
        int figureIndex = rand.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (figureIndex) {
            case 0:
                return new Square(rand.nextDouble(100) + 1, color);
            case 1:
                return new Rectangle(rand.nextDouble(100) + 1, rand.nextDouble(100) + 1, color);
            case 2:
                return new Circle(rand.nextDouble(100) + 1, color);
            case 3:
                return new RightTriangle(rand.nextDouble(100) + 1, rand.nextDouble(100) + 1, color);
            case 4:
                return new IsoscelesTrapezoid(rand.nextDouble(100) + 1,
                        rand.nextDouble(100) + 1,
                        rand.nextDouble(100) + 1, color);
            default:
                return getDefaultFigure();
        }
    }

    public BaseEntity getDefaultFigure() {
        return new Circle(10, Colors.WHITE.toString());
    }
}
