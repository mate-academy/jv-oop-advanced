package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int index = random.nextInt(FigureNames.values().length);
    private final double randomValue = random.nextDouble();

    public Figure getRandomFigure() {
        switch (FigureNames.values()[index]) {
            case CIRCLE:
                return new Circle(
                        randomValue, colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        randomValue,
                        randomValue,
                        randomValue, colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(
                        randomValue, colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(
                        randomValue, randomValue, colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        randomValue, colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(randomValue, Color.WHITE);
    }
}
