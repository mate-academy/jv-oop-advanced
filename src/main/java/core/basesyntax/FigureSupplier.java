package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final double RANDOM_RANGE = 10.0;
    private static final double RANDOM_MINIMUM = 1.0;

    private final ColorSupplier colorSupplier;
    private final Random rand;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.rand = new Random();
    }

    public AbstractFigure getRandomFigure() {
        int figureType = rand.nextInt(NUMBER_OF_FIGURE_TYPES);
        Color randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createRandomSquare(randomColor);
            case 1:
                return createRandomRectangle(randomColor);
            case 2:
                return createRandomRightTriangle(randomColor);
            case 3:
                return createRandomCircle(randomColor);
            case 4:
                return createRandomIsoscelesTrapezoid(randomColor);
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }

    private double getRandomDouble() {
        return rand.nextDouble() * RANDOM_RANGE + RANDOM_MINIMUM;
    }

    private Square createRandomSquare(Color color) {
        double sideLength = getRandomDouble();
        return new Square(color, sideLength);
    }

    private Rectangle createRandomRectangle(Color color) {
        double width = getRandomDouble();
        double height = getRandomDouble();
        return new Rectangle(width, height, color);
    }

    private RightTriangle createRandomRightTriangle(Color color) {
        double base = getRandomDouble();
        double height = getRandomDouble();
        return new RightTriangle(base, height, color);
    }

    private Circle createRandomCircle(Color color) {
        double radius = getRandomDouble();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(Color color) {
        double topBase = getRandomDouble();
        double bottomBase = getRandomDouble();
        double height = getRandomDouble();
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }
}
