package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getSquare();
            case 4:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_VALUE);
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber());
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }
}



