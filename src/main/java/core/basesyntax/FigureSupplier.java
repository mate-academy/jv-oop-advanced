package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 4;
    public static final int UPPER_BOUND = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getSquare();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getCircle();
            case 4:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getSquare() {
        return new Square((random.nextInt(UPPER_BOUND - 1) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getRectangle() {
        return new Rectangle((random.nextInt(UPPER_BOUND - 1) + 1),
                (random.nextInt(UPPER_BOUND - 1) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getRightTriangle() {
        return new RightTriangle(
                (random.nextInt(UPPER_BOUND - 1) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getCircle() {
        return new Circle((random.nextInt(UPPER_BOUND - 1) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                (random.nextInt(UPPER_BOUND - 1) + 1),
                (random.nextInt(UPPER_BOUND - 1) + 1),
                (random.nextInt(UPPER_BOUND - 1) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

}
