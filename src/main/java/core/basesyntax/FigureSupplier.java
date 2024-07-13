package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return createSquare(color);
            case 1:
                return createRightTriangle(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createCircle(color);
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square createSquare(String color) {
        return new Square(color, random.nextDouble());
    }

    private RightTriangle createRightTriangle(String color) {
        return new RightTriangle(color, random.nextDouble(), random.nextDouble());
    }

    private Rectangle createRectangle(String color) {
        return new Rectangle(color, random.nextDouble(), random.nextDouble());
    }

    private Circle createCircle(String color) {
        return new Circle(color, random.nextDouble());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextDouble(),
            random.nextDouble(), random.nextDouble());
    }
}
