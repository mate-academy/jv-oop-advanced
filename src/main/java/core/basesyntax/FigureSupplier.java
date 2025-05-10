package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double RADIUS_CIRCLE = 10;
    private static final String COLOR_CIRCLE = Colors.WHITE.name();
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURE_COUNT);
        switch (figure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }

    }

    private Square getRandomSquare() {
        return new Square(ColorSupplier.getRandomColor(), side());
    }

    private Rectangle getRandomRightTriangle() {
        return new Rectangle(ColorSupplier.getRandomColor(), side(), side());
    }

    private RightTriangle getRandomRectangle() {
        return new RightTriangle(ColorSupplier.getRandomColor(), side(), side());
    }

    private Circle getRandomCircle() {
        return new Circle(ColorSupplier.getRandomColor(), side());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), side(), side(), side());

    }

    private double side() {
        return random.nextDouble();

    }

    public static Figure getDefaultFigure() {
        return new Circle(COLOR_CIRCLE, RADIUS_CIRCLE);
    }
}

