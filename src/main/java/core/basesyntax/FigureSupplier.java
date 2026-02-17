package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_DIMENSION = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        int side = 1 + random.nextInt(MAX_RANDOM_DIMENSION);
        int side1 = 1 + random.nextInt(MAX_RANDOM_DIMENSION);
        int side2 = 1 + random.nextInt(MAX_RANDOM_DIMENSION);
        int height = 1 + random.nextInt(MAX_RANDOM_DIMENSION);
        int radius = 1 + random.nextInt(MAX_RANDOM_DIMENSION);

        switch (number) {
            case 0 -> { return new Square(side, color); }
            case 1 -> { return new Rectangle(side1, side2, color); }
            case 2 -> { return new RightTriangle(side1, side2, color); }
            case 3 -> { return new Circle(radius, color); }
            case 4 -> { return new IsoscelesTrapezoid(side1, side2, height, color); }
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, "white");
    }

}
