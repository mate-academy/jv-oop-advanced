package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COEFFICIENT = 10;
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final Random random = new Random();

    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        switch (new Random().nextInt(NUMBER_OF_FIGURE)) {
            case 0:
                return createRandomCircle(color);
            case 1:
                return createRandomSquare(color);
            case 2:
                return createRandomRectangle(color);
            case 3:
                return createRandomRightTriangle(color);
            case 4:
                return createRandomIsoscelesTrapezoid(color);
            default:
                return getDefaultFigure();
        }
    }

    public final Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Circle createRandomCircle(String color) {
        double radius = random.nextDouble() * COEFFICIENT;
        return new Circle(radius, color);
    }

    private Square createRandomSquare(String color) {
        double side = random.nextDouble() * COEFFICIENT;
        return new Square(side, color);
    }

    private Rectangle createRandomRectangle(String color) {
        double length = random.nextDouble() * COEFFICIENT;
        double height = random.nextDouble() * COEFFICIENT;
        return new Rectangle(length, height, color);
    }

    private RightTriangle createRandomRightTriangle(String color) {
        double base = random.nextDouble() * COEFFICIENT;
        double height = random.nextDouble() * COEFFICIENT;
        return new RightTriangle(base, height, color);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(String color) {
        double top = random.nextDouble() * COEFFICIENT;
        double bottom = random.nextDouble() * COEFFICIENT;
        double height = random.nextDouble() * COEFFICIENT;
        return new IsoscelesTrapezoid(top, bottom, height, color);
    }
}
