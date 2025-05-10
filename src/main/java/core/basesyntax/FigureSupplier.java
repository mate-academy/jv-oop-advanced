package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_NUMBER = 100;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle() {
        int fistSide = random.nextInt(MAX_NUMBER);
        int secondSide = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color, fistSide, secondSide);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int firstBase = random.nextInt(MAX_NUMBER);
        int secondBase = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
    }
}
