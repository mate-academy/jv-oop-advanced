package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOR = "white";
    private static final int RADIUS = 10;
    private static final int FIGURE_NUMBER = 4;
    private static final int RANDOM_MAX = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_NUMBER);
        switch (index) {
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
                break;
        }
        return null;
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(RANDOM_MAX), colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX),
                random.nextInt(RANDOM_MAX), colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(RANDOM_MAX), colorSupplier.getRandomColor());
    }

    Figure getDefaultFigure() {
        return new Circle(RADIUS, COLOR);
    }
}
