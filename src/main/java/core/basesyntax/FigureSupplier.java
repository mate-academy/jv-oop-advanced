package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Models models;

    public Figure getRandomFigure() {
        models = Models.values()[random.nextInt(Models.values().length)];
        switch (models) {
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case SQUARE:
                return getRandomSquare();
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int high = random.nextInt(MAX_VALUE);
        int top = random.nextInt(MAX_VALUE);
        int bottom = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(top, bottom, high, color);
    }

    private Rectangle getRandomRectangle() {
        int width = random.nextInt(MAX_VALUE);
        int length = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(length, width, color);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_VALUE);
        int secondLeg = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }
}
