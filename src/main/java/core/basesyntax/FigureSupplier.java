package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 25;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE);
        Color color = supplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_VALUE);
        Color color = supplier.getRandomColor();
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle() {
        int sideA = random.nextInt(MAX_VALUE);
        int sideB = random.nextInt(MAX_VALUE);
        Color color = supplier.getRandomColor();
        return new Rectangle(color, sideA, sideB);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int height = random.nextInt(MAX_VALUE);
        int basis1 = random.nextInt(MAX_VALUE);
        int basis2 = random.nextInt(MAX_VALUE);
        Color color = supplier.getRandomColor();
        return new IsoscelesTrapezoid(color, height, basis1, basis2);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_VALUE);
        int secondLeg = random.nextInt(MAX_VALUE);
        Color color = supplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }
}
