package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int PRECISION = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        String color = this.colorSupplier.getRandomColor();

        switch (figureType) {
            case CIRCLE: {
                return new Circle(color, getRandomPropertyValue());
            }
            case SQUARE: {
                return new Square(color, getRandomPropertyValue());
            }
            case RECTANGLE: {
                return new Rectangle(color, getRandomPropertyValue(), getRandomPropertyValue());
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(color, getRandomPropertyValue(), getRandomPropertyValue());
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(
                  color, getRandomPropertyValue(),
                  getRandomPropertyValue(),
                  getRandomPropertyValue()
                );
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    private double getRandomPropertyValue() {
        return (double) random.nextInt(MAX_VALUE) / PRECISION;
    }
}
