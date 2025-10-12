package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_DIMENSION = 10;
    private static final int MIN_RANDOM_VALUE = 1;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                double side = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                String squareColor = colorSupplier.getRandomColor();
                return new Square(side, squareColor);

            case 1:
                double width = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                double height = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                String rectColor = colorSupplier.getRandomColor();
                return new Rectangle(width, height, rectColor);

            case 2:
                double firstLeg = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                double secondLeg = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                String triColor = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, triColor);

            case 3:
                double topBase = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                double delta = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                double bottomBase = topBase + delta;
                double trapHeight = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                String trapColor = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(topBase, bottomBase, trapHeight, trapColor);

            default:
                double radius = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_VALUE;
                String circColor = colorSupplier.getRandomColor();
                return new Circle(radius, circColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
