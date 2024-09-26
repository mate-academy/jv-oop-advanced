package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = String.valueOf(colorSupplier.getRandomColor());
        switch (figureType) {
            case 0:
                return createCircle(color);
            case 1:
                return createSquare(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createRightTriangle(color);
            case 4:
                return createIsoscelesTrapezoid(color);
            default:
                return getDefaultFigure();
        }
    }

    private Circle createCircle(String color) {
        double radius = random.nextDouble() * MAX_SIZE;
        return new Circle(color, radius);
    }

    private Square createSquare(String color) {
        double side = random.nextDouble() * MAX_SIZE;
        return new Square(color, side);
    }

    private Rectangle createRectangle(String color) {
        double length = random.nextDouble() * MAX_SIZE;
        double width = random.nextDouble() * MAX_SIZE;
        return new Rectangle(color, length, width);
    }

    private RightTriangle createRightTriangle(String color) {
        double base = random.nextDouble() * MAX_SIZE;
        double height = random.nextDouble() * MAX_SIZE;
        return new RightTriangle(color, base, height);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        double base1 = random.nextDouble() * MAX_SIZE;
        double base2 = random.nextDouble() * MAX_SIZE;
        double height = random.nextDouble() * MAX_SIZE;
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
