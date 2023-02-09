package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int FIGURE_BOUND = 5;
    public static final int RANDOM_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_BOUND)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return null;
        }
    }

    private Square getRandomSquare() {
        int side = random.nextInt(RANDOM_NUMBER);
        return new Square(supplier.getRandomColor(), side);
    }

    private Rectangle getRandomRectangle() {
        int length = random.nextInt(RANDOM_NUMBER);
        int width = random.nextInt(RANDOM_NUMBER);
        return new Rectangle(supplier.getRandomColor(), length, width);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(RANDOM_NUMBER);
        return new Circle(supplier.getRandomColor(), radius);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(RANDOM_NUMBER);
        int secondLeg = random.nextInt(RANDOM_NUMBER);
        return new RightTriangle(supplier.getRandomColor(), firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int height = random.nextInt(RANDOM_NUMBER);
        int longerBase = random.nextInt(RANDOM_NUMBER);
        int shorterBase = random.nextInt(RANDOM_NUMBER);
        return new IsoscelesTrapezoid(supplier.getRandomColor(), height, longerBase, shorterBase);
    }
}
