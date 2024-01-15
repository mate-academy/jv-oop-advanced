package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT = 4;
    private static final int MAX_VALUE = 5;
    private static final int MIN_VALUE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int random = getRandomIndex();
        if (random == 1) {
            return getRandomSquare();
        } else if (random == 2) {
            return getRandomRightTriangle();
        } else if (random == 3) {
            return getRandomIsoscelesTrapezoid();
        } else if (random == 4) {
            return getRandomCircle();
        } else {
            return getRandomRectangle();
        }
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomParameters(), getRandomParameters());
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomParameters());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomParameters(), getRandomParameters(), getRandomParameters());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomParameters(), getRandomParameters());
    }

    private Square getRandomSquare() {
        return new Square(DEFAULT_COLOR, getRandomParameters());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomIndex() {
        return random.nextInt(AMOUNT) + 1;
    }

    private int getRandomParameters() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
