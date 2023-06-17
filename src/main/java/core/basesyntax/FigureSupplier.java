package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANDOM_LENGTH_MAX = 10;
    private static final int FIGURE_COUNT = Figures.values().length;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomInt());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomInt());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt(),
                getRandomInt());
    }

    private int getRandomInt() {
        return random.nextInt(RANDOM_LENGTH_MAX) + 1;
    }
}
