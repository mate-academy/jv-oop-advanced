package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_BOUND_VALUE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        return new Square(color, side);
    }

    public Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int sideA = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        int sideB = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        return new Rectange(color,sideA, sideB);
    }

    public Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        int secondLeg = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int topBase = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        int bottomBase = topBase + random.nextInt(RANDOM_BOUND_VALUE) + 1;
        int side = random.nextInt(RANDOM_BOUND_VALUE) + 1;
        return new IsoscelesTrapezoid(color, topBase, bottomBase, side);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
