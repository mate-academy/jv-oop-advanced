package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUE = 50;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE + 1);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int longerBase = random.nextInt(MAX_VALUE + 1);
        int shorterBase = random.nextInt(MAX_VALUE + 1);
        int height = random.nextInt(MAX_VALUE + 1);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                longerBase, shorterBase, height);
    }

    private Rectangle getRandomRectangle() {
        int width = random.nextInt(MAX_VALUE + 1);
        int height = random.nextInt(MAX_VALUE + 1);
        return new Rectangle(colorSupplier.getRandomColor(), width,height);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_VALUE + 1);
        int secondLeg = random.nextInt(MAX_VALUE + 1);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg,secondLeg);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_VALUE + 1);
        return new Square(colorSupplier.getRandomColor(), side);
    }
}
