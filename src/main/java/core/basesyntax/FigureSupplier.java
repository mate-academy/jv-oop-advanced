package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private static final int DEFAULT_RADIUS = 10;
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
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor("WHITE");
        return circle;
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_VALUE));
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(MAX_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE));
    }
}
