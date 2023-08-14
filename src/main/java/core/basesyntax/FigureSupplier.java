package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 5;
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(BOUND);
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getSquare();
            case 3:
                return getRightTriangle();
            default:
                return getRectangle();
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_VALUE) + 1;
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    private Figure getCircle() {
        return new Circle(getRandomColor(), getRandomInt());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomColor(), getRandomInt(),
                getRandomInt(), getRandomInt());
    }

    private Figure getRectangle() {
        return new Rectangle(getRandomColor(), getRandomInt(), getRandomInt());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(getRandomColor(), getRandomInt(), getRandomInt());
    }

    private Figure getSquare() {
        return new Square(getRandomColor(), getRandomInt());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
