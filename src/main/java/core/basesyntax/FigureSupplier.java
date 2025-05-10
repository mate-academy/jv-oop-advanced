package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final double DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int FIGURE_BOUND = 5;
    public static final int RANDOM_NUMBER = 20;
    public static final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_BOUND);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRightIsoscelesTrapezoid();
            case 4:
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(RANDOM_NUMBER);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(RANDOM_NUMBER);
        int secondLeg = random.nextInt(RANDOM_NUMBER);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(RANDOM_NUMBER);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private IsoscelesTrapezoid getRandomRightIsoscelesTrapezoid() {
        int firstLeg = random.nextInt(RANDOM_NUMBER);
        int secondLeg = random.nextInt(RANDOM_NUMBER);
        int hight = random.nextInt(RANDOM_NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                       firstLeg,
                                       secondLeg,
                                       hight);
    }

    private Rectangle getRandomRectangle() {
        int firstLeg = random.nextInt(RANDOM_NUMBER);
        int secondLeg = random.nextInt(RANDOM_NUMBER);
        return new Rectangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }
}
