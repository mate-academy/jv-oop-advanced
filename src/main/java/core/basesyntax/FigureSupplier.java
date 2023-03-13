package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 100;

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(),DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),getRandomNumber());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),getRandomNumber(),getRandomNumber());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),getRandomNumber());
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }
}
