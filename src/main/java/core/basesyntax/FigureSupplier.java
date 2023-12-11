package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final double DEFAULT_SIZE = 10.0;
    private static final double MAX_FIGURE_SIZE = 20.0;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomType = random.nextInt(FIGURE_NUMBER);
        String color = colorSupplier.getRandomColor();

        switch (randomType) {
            case 0:
                return createCircle(color);
            case 1:
                return createRectangle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createIsoscelesTrapezoid(color);
            case 4:
                return createSquare(color);
            default:
                return getDefaultFigure();
        }
    }

    private Circle createCircle(String color) {
        return new Circle(color, random.nextDouble() * MAX_FIGURE_SIZE);
    }

    private Rectangle createRectangle(String color) {
        return new Rectangle(color, random.nextDouble() * MAX_FIGURE_SIZE,
                random.nextDouble() * MAX_FIGURE_SIZE);
    }

    private RightTriangle createRightTriangle(String color) {
        return new RightTriangle(color, random.nextDouble() * MAX_FIGURE_SIZE,
                random.nextDouble() * MAX_FIGURE_SIZE);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_FIGURE_SIZE,
                random.nextDouble() * MAX_FIGURE_SIZE, random.nextDouble() * MAX_FIGURE_SIZE);
    }

    private Square createSquare(String color) {
        return new Square(color, random.nextDouble() * MAX_FIGURE_SIZE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_SIZE);
    }
}
