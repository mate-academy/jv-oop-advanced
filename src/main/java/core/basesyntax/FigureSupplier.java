package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int VALUE_COUNT = 100;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(VALUE_COUNT), color.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(VALUE_COUNT),
                random.nextInt(VALUE_COUNT),
                random.nextInt(VALUE_COUNT),
                color.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(VALUE_COUNT),
                random.nextInt(VALUE_COUNT),
                color.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(VALUE_COUNT),
                random.nextInt(VALUE_COUNT),
                color.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(VALUE_COUNT), color.getRandomColor());
    }

    public Figure getDefaultFigure() {
        final String white = Color.WHITE.name();
        return new Circle(DEFAULT_VALUE, white);
    }
}
