package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_MAX = 10;
    private static final String COLOR = "white";
    private static final int RADIUS = 10;
    private static final int NUMBER_FIGURE = 4;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_FIGURE);
        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                break;
        }
        return null;
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM_MAX));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(RANDOM_MAX));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX));
    }

    Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }
}
