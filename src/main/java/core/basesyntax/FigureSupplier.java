package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIDE = 100;
    private static final int MAX_WIDTH = 200;
    private static final int MAX_HEIGHT = 250;
    private static final int MAX_BASE = 50;
    private static final int MAX_RADIUS = 25;
    private static final int MAX_TOP_BASE = 50;
    private static final int MAX_BOTTOM_BASE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Figure getRandomSquare() {
        int randomSide = random.nextInt(MAX_SIDE) + 1;
        return new Square(colorSupplier.getRandomColor(), randomSide);
    }

    private Figure getRandomRectangle() {
        int randomWidth = random.nextInt(MAX_WIDTH) + 1;
        int randomHeight = random.nextInt(MAX_HEIGHT) + 1;
        return new Rectangle(colorSupplier.getRandomColor(), randomWidth, randomHeight);
    }

    private Figure getRandomRightTriangle() {
        int randomBase = random.nextInt(MAX_BASE) + 1;
        int randomHeight = random.nextInt(MAX_HEIGHT) + 1;
        return new RightTriangle(colorSupplier.getRandomColor(), randomBase, randomHeight);
    }

    private Figure getRandomCircle() {
        int randomRadius = random.nextInt(MAX_RADIUS) + 1;
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int randomTopBase = random.nextInt(MAX_TOP_BASE);
        int randomBottomBase = random.nextInt(MAX_BOTTOM_BASE);
        int randomHeight = random.nextInt(MAX_HEIGHT);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomTopBase,
                randomBottomBase, randomHeight);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureIndex) {
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
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
