package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final int FIGURE_BOUND = 5;
    private static final int MAX_BOUND_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_BOUND)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }
    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND_NUMBER));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND_NUMBER),
                random.nextInt(MAX_BOUND_NUMBER),
                random.nextInt(MAX_BOUND_NUMBER));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND_NUMBER),
                random.nextInt(MAX_BOUND_NUMBER));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND_NUMBER),
                random.nextInt(MAX_BOUND_NUMBER));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND_NUMBER));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_RADIUS);
    }
}
