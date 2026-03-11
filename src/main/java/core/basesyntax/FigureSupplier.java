package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private static final double DEFAULT_FIGURE_BOUND = 11;
    private static final int FIGURES_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0: {
                double radius = random.nextDouble(DEFAULT_FIGURE_BOUND);
                return new Circle(color, radius);
            }
            case 1: {
                double side = random.nextDouble(DEFAULT_FIGURE_BOUND);
                return new Square(color, side);
            }
            case 2: {
                double width = random.nextDouble(DEFAULT_FIGURE_BOUND);
                double height = random.nextDouble(DEFAULT_FIGURE_BOUND);
                return new Rectangle(color, width, height);
            }
            case 3: {
                double legA = random.nextDouble(DEFAULT_FIGURE_BOUND);
                double legB = random.nextDouble(DEFAULT_FIGURE_BOUND);
                return new RightTriangle(color, legA, legB);
            }
            case 4: {
                double base1 = random.nextDouble(DEFAULT_FIGURE_BOUND);
                double base2 = random.nextDouble(DEFAULT_FIGURE_BOUND);
                double height = random.nextDouble(DEFAULT_FIGURE_BOUND);
                return new IsoscelesTrapezoid(color, base1, base2, height);
            }
            default: {
                double radius = random.nextDouble(DEFAULT_FIGURE_BOUND);
                return new Circle(color, radius);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
