package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int UNITS_COUNT = 11;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomInt(FIGURE_COUNT)) {
            case 0: {
                return getSquare();
            }
            case 1: {
                return getCircle();
            }
            case 2: {
                return getRectangle();
            }
            case 3: {
                return getRightTriangle();
            }
            default: {
                return getIsoscelesTrapezoid();
            }
        }
    }

    public int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name().toLowerCase());
    }

    private Square getSquare() {
        String color = colorSupplier.getRandomColor();
        int side = getRandomInt(UNITS_COUNT);
        return new Square(side, color);
    }

    private Circle getCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = getRandomInt(UNITS_COUNT);
        return new Circle(radius, color);
    }

    private Rectangle getRectangle() {
        String color = colorSupplier.getRandomColor();
        int height = getRandomInt(UNITS_COUNT);
        int width = getRandomInt(UNITS_COUNT);
        return new Rectangle(height, width, color);
    }

    private RightTriangle getRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = getRandomInt(UNITS_COUNT);
        int secondLeg = getRandomInt(UNITS_COUNT);
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int upperBase = getRandomInt(UNITS_COUNT);
        int lowerBase = getRandomInt(UNITS_COUNT);
        int height = getRandomInt(UNITS_COUNT);
        return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
    }
}
