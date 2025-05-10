package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final double DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomDimension() {
        return random.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                int sideLength = getRandomDimension();
                return new Square(color, sideLength);
            case 1:
                int width = getRandomDimension();
                int height = getRandomDimension();
                return new Rectangle(color, width, height);
            case 2:
                int firstLeg = getRandomDimension();
                int secondLeg = getRandomDimension();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                int radius = getRandomDimension();
                return new Circle(color, radius);
            case 4:
                int firstBase = getRandomDimension();
                int secondBase = getRandomDimension();
                int trapezoidHeight = getRandomDimension();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, trapezoidHeight);
            default:
                throw new IllegalArgumentException("Invalid figure number: " + figureNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
