package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;

    private final Random random = new Random();

    private final ColorSuplier colorSuplier = new ColorSuplier();

    public AbstractFigure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return switch (figureNumber) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomRectangle();
            case 2 -> createRandomRightTriangle();
            case 3 -> createRandomSquare();
            case 4 -> createRandomIsoscelesTrapezoid();
            default -> throw new IllegalStateException("Unexpected value: " + figureNumber);
        };
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, colorSuplier.getDefaultColor());
    }

    private Circle createRandomCircle() {
        return new Circle(generateRandomSize(), colorSuplier.getRandomColor());
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(generateRandomSize(), generateRandomSize(),
                colorSuplier.getRandomColor());
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(generateRandomSize(), generateRandomSize(),
                colorSuplier.getRandomColor());
    }

    private Square createRandomSquare() {
        return new Square(generateRandomSize(),
                colorSuplier.getRandomColor());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                generateRandomSize(),
                generateRandomSize(),
                generateRandomSize(),
                colorSuplier.getRandomColor());
    }

    private double generateRandomSize() {
        return random.nextDouble() * 10 + 1;
    }
}
