package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURE = 5;
    private static final int BOUND = 100;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.BLACK;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBERS_OF_FIGURE)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomTriangle();
            case 3:
                return getRandomTrapezoid();
            case 4:
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    private int randomInt() {
        return random.nextInt(BOUND);
    }

    private Figure getRandomCircle() {
        return new Circle(Color.valueOf(colorSupplier.getRandomColor()), randomInt());
    }

    private Figure getRandomSquare() {
        return new Square(Color.valueOf(colorSupplier.getRandomColor()), randomInt());
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(Color.valueOf(colorSupplier.getRandomColor()),
                randomInt(), randomInt());
    }

    private Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(Color.valueOf(colorSupplier.getRandomColor()), randomInt(),
                randomInt(), randomInt());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(Color.valueOf(colorSupplier.getRandomColor()),
                randomInt(), randomInt());
    }
}
