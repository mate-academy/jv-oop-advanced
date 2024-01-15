package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final double DEFAULT_RADIUS = 10;
    public static final int MAX_RANDOM_NUMBER = 50;
    public static final int MIN_RANDOM_NUMBER = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURE_COUNT);
        switch (randomFigureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getDouble());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getDouble(), getDouble(),
                getDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getDouble(), getDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getDouble(), getDouble());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getDouble());
    }

    private double getDouble() {
        return MIN_RANDOM_NUMBER + random.nextInt(MAX_RANDOM_NUMBER) + random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
