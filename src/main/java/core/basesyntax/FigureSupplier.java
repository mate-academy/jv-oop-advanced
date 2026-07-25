package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int MIN_VALUE = 1;
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0 -> {
                double radius = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new Circle(randomColor, radius);
            }
            case 1 -> {
                double side = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new Square(randomColor, side);
            }
            case 2 -> {
                double width = random.nextInt(MAX_VALUE) + MIN_VALUE;
                double rectangleHeight = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new Rectangle(randomColor, width, rectangleHeight);
            }
            case 3 -> {
                double firstLeg = random.nextInt(MAX_VALUE) + MIN_VALUE;
                double secondLeg = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            }
            default -> {
                double topBase = random.nextInt(MAX_VALUE) + MIN_VALUE;
                double bottomBase = random.nextInt(MAX_VALUE) + MIN_VALUE;
                double trapezoidHeight = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, trapezoidHeight);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
