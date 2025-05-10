package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Circle createCircle(String color) {
        return new Circle(color, random.nextInt(MAX_VALUE));
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Rectangle createRectangle(String color) {
        return new Rectangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private RightTriangle createRightTriangle(String color) {
        return new RightTriangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Square createSquare(String color) {
        return new Square(color, random.nextInt(MAX_VALUE));
    }

    public Figure getRandomFigure() {
        FigureTypes figureType = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case CIRCLE:
                return createCircle(color);
            case ISOSCELES_TRAPEZOID:
                return createIsoscelesTrapezoid(color);
            case RECTANGLE:
                return createRectangle(color);
            case RIGHT_TRIANGLE:
                return createRightTriangle(color);
            default:
                return createSquare(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}

