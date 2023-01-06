package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Shape getRandomShape() {
        return Shape.values()[random.nextInt(Constants.SHAPES)];
    }

    public Figure getDefaultFigure() {
        int defaultSize = 10;
        Color defaultColor = Color.WHITE;
        return new Circle(defaultColor, defaultSize);
    }

    public Figure getRandomFigure() {
        switch (getRandomShape()) {
            case CIRCLE:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1);
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1,
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1,
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1,
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1);
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1,
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1,
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1);
            case SQUARE:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(Constants.MAX_LENGHT - 1) + 1);
            default:
                return getDefaultFigure();
        }
    }
}
