package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_SIZE = 10;
    private static final int RANDOM_INDEX = 5;
    private static final String DEFAULT_CIRCLE_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(RANDOM_INDEX);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_CIRCLE_COLOR);
    }

    private Circle getRandomCircle() {
        double randomRadius = random.nextInt(DEFAULT_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Circle(randomRadius, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double first = random.nextInt(DEFAULT_SIZE) + 1;
        double second = random.nextInt(DEFAULT_SIZE) + 1;
        double height = random.nextInt(DEFAULT_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(first, second, height, color);
    }

    private Rectangle getRandomRectangle() {
        double first = random.nextInt(DEFAULT_SIZE) + 1;
        double second = random.nextInt(DEFAULT_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Rectangle(first, second, color);
    }

    private RightTriangle getRandomTriangle() {
        double first = random.nextInt(DEFAULT_SIZE) + 1;
        double second = random.nextInt(DEFAULT_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(first, second, color);
    }

    private Square getRandomSquare() {
        double first = random.nextInt(DEFAULT_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Square(first, color);
    }
}
