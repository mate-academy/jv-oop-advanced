package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final double MAX_NUMBER = 10;
    private static final int RANDOM_INDEX = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(RANDOM_INDEX);
        String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return createRandomSquare(color);
            case 1:
                return createRandomRectangle(color);
            case 2:
                return createRandomTriangle(color);
            case 3:
                return createRandomCircle(color);
            case 4:
                return createRandomTrapezoid(color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_NUMBER);
    }

    private Rectangle createRandomRectangle(String color) {
        return new Rectangle(color, random.nextDouble(), random.nextDouble());
    }

    private IsoscelesTrapezoid createRandomTrapezoid(String color) {
        return new IsoscelesTrapezoid(
                color, random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    private Circle createRandomCircle(String color) {
        return new Circle(color, random.nextDouble());
    }

    private Square createRandomSquare(String color) {
        return new Square(color, random.nextDouble());
    }

    private RightTriangle createRandomTriangle(String color) {
        return new RightTriangle(color, random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }
}
