package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 5;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private static final int COUNT_OF_RANDOM = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        switch (randomFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                String.valueOf(colorSupplier.getRandomColor()), random.nextInt(COUNT_OF_RANDOM),
                random.nextInt(COUNT_OF_RANDOM), random.nextInt(COUNT_OF_RANDOM));
    }

    private Figure getRandomCircle() {
        return new Circle(String.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(100));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(String.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(COUNT_OF_RANDOM), random.nextInt(COUNT_OF_RANDOM));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(String.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(COUNT_OF_RANDOM), random.nextInt(COUNT_OF_RANDOM));
    }

    private Figure getRandomSquare() {
        return new Square(String.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(COUNT_OF_RANDOM));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
