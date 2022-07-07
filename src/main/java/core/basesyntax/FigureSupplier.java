package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_FIGURE = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_NUMBER = 10;
    private static final int LIMIT_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(DEFAULT_FIGURE);
        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt(),
                getRandomInt());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private int getRandomInt() {
        return random.nextInt(LIMIT_NUMBER);
    }
}
