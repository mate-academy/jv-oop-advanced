package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int MIN_VALUE = 1;
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figure = random.nextInt(FIGURE_COUNT);

        switch (figure) {
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
                double height = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new Rectangle(randomColor, width, height);
            }
            case 3 -> {
                int firstLeg = random.nextInt(MAX_VALUE) + MIN_VALUE;
                int secondLeg = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            }
            default -> {
                int topBase = random.nextInt(MAX_VALUE) + MIN_VALUE;
                int bottomBase = random.nextInt(MAX_VALUE) + MIN_VALUE;
                int height = random.nextInt(MAX_VALUE) + MIN_VALUE;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }
}
