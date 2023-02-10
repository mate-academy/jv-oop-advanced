package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int NUMBER_OF_FIGURE = 5;
    private static final String COLOR_BY_DEFAULT = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_VALUE);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private RightTriangle getRandomRightTriangle() {
        int side = random.nextInt(MAX_VALUE);
        int height = random.nextInt(MAX_VALUE);
        return new RightTriangle(colorSupplier.getRandomColor(), side, height);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Rectangle getRandomRectangle() {
        int firstSide = random.nextInt(MAX_VALUE);
        int secondSide = random.nextInt(MAX_VALUE);
        return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int firstSide = random.nextInt(MAX_VALUE);
        int secondSide = random.nextInt(MAX_VALUE);
        int height = random.nextInt(MAX_VALUE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                firstSide, secondSide, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_BY_DEFAULT, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int getRandomFigureNumber = random.nextInt(NUMBER_OF_FIGURE);
        switch (getRandomFigureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }
}
