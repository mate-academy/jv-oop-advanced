package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 256;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE: {
                return getRandomCircle();
            }
            case SQUARE: {
                return getRandomSquare();
            }
            case RECTANGLE: {
                return getRandomRectamgle();
            }
            case RIGHT_TRIANGLE: {
                return getRandomRightTriangle();
            }
            case ISOSCELES_TRAPEZOID:
            default: {
                return getRandomIsoscelesTrapezoid();
            }
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectamgle() {
        return new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor());
    }
}
