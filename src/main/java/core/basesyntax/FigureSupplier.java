package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_LIMIT = 100;
    private static final int NUM_FIGURE_TYPES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUM_FIGURE_TYPES);
        Color color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0 -> {
                int radius = random.nextInt(NUMBER_LIMIT) + 1;
                return new Circle(radius, color);
            }
            case 1 -> {
                int height = random.nextInt(NUMBER_LIMIT) + 1;
                int smallerSide = random.nextInt(NUMBER_LIMIT) + 1;
                int biggerSide = random.nextInt(NUMBER_LIMIT) + 1;
                return new IsoscelesTrapezoid(height, smallerSide, biggerSide, color);
            }
            case 2 -> {
                int width = random.nextInt(NUMBER_LIMIT) + 1;
                int length = random.nextInt(NUMBER_LIMIT) + 1;
                return new Rectangle(width, length, color);
            }
            case 3 -> {
                int firstLeg = random.nextInt(NUMBER_LIMIT) + 1;
                int secondLeg = random.nextInt(NUMBER_LIMIT) + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            }
            default -> {
                int generalSide = random.nextInt(NUMBER_LIMIT) + 1;
                return new Square(generalSide, color);
            }
        }
    }

    public Figure getDefaultFigure() {
        Color color = colorSupplier.getDefaultColor();
        return new Circle(DEFAULT_RADIUS, color);
    }
}
