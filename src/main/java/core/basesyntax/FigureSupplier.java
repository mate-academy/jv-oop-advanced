package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_BOUND = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURE_NUMBER);
        switch (value) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Circle getCircle() {
        return new Circle(random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRectangle() {
        return new Rectangle(random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
    }

    private Square getSquare() {
        return new Square(random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
    }

}
