package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_NUMBER = 5;
    public static final double CIRCLE_RADIUS = 10.0D;
    public static final String CIRCLE_COLOR = Color.WHITE.name();
    public static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_NUMBER);
        switch (number) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(color.getRandomColor(), side());
    }

    private Square getRandomSquare() {
        return new Square(color.getRandomColor(), side());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(color.getRandomColor(), side(), side());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(color.getRandomColor(), side(), side());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(color.getRandomColor(), side(), side(), side());
    }

    private double side() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }
}
