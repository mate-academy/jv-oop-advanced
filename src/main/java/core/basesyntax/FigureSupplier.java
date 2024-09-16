package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureType) {
            case 0:
                return new Circle(color, random.nextDouble() * 10);
            case 1:
                return new Square(color, random.nextDouble() * 10);
            case 2:
                return new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3:
                return new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
