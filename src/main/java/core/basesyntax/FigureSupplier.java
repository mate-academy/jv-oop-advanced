package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double CIRCLE_RADIUS = 10;
    private static final int FIGURE_BOUND = 5;
    private static final int MAX_BOUND_NUMBER = 100;
    private static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_BOUND)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomSquare();
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_BOUND_NUMBER);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(), getRandomNumber());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, CIRCLE_RADIUS);
    }
}
