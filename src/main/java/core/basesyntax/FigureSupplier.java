package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 256;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int index;

    public int getRandomInt() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        switch (FigureEnum.values()[random.nextInt(FigureEnum.values().length)]) {
            case CIRCLE: {
                return new Circle(getRandomInt(), colorSupplier.getRandomColor());
            }
            case SQUARE: {
                return new Square(getRandomInt(), colorSupplier.getRandomColor());
            }
            case RECTANGLE: {
                return new Rectangle(getRandomInt(), getRandomInt(),
                        colorSupplier.getRandomColor());
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(getRandomInt(), colorSupplier.getRandomColor());
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(getRandomInt(),
                        getRandomInt(), colorSupplier.getRandomColor());
            }
            default: return getDefaultFigure();
        }
    }
}
