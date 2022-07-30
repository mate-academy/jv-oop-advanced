package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final double DEFAULT_VALUE = 3.0;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureNames.values().length);
        switch (FigureNames.values()[index]) {
            case CIRCLE:
                return new Circle(
                        DEFAULT_VALUE, new ColorSupplier().getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        DEFAULT_VALUE,
                        DEFAULT_VALUE,
                        DEFAULT_VALUE, new ColorSupplier().getRandomColor());
            case SQUARE:
                return new Square(
                        DEFAULT_VALUE, new ColorSupplier().getRandomColor());
            case RECTANGLE:
                return new Rectangle(
                        DEFAULT_VALUE, DEFAULT_VALUE, new ColorSupplier().getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        DEFAULT_VALUE, new ColorSupplier().getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE, Color.WHITE);
    }
}
