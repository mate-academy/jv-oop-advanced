package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Color DEFAULT_COLOR = Color.WHITE;

    public final Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX_VALUE),
                random.nextInt(RANDOM_MAX_VALUE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX_VALUE),
                random.nextInt(RANDOM_MAX_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX_VALUE),
                random.nextInt(RANDOM_MAX_VALUE));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX_VALUE));
    }

    public Figure getRandomFigure() {
        Model model = Model.values()[random.nextInt(Model.values().length)];
        switch (model) {
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
                return getDefaultFigure();
        }
    }
}
