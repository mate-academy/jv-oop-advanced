package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_LENGTH = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case (0):
                return getRandomCircle();
            case (1):
                return getRandomSquare();
            case (2):
                return getRandomRectangle();
            case (3):
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH), supplier.getRandomColor());
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_LENGTH), supplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(MAX_LENGTH), supplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), supplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH),random.nextInt(MAX_LENGTH), supplier.getRandomColor());
    }
}
