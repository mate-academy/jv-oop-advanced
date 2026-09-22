package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FigureNames.values().length;
    private static final int RANDOM_LIMIT = 50;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();

    private final Random randomValueSupplier = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int figureIndex = randomValueSupplier.nextInt(FIGURE_COUNT);
        FigureNames figureName = FigureNames.values()[figureIndex];
        String color = colorSupplier.getRandomColor();
        switch (figureName) {
            case CIRCLE:
                int radius = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Circle(radius, color);
            case SQUARE:
                int side = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Square(side, color);
            case RECTANGLE:
                int sideA = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                int sideB = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Rectangle(sideA, sideB, color);
            case RIGHT_TRIANGLE:
                int firstLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                int secondLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new RightTriangle(firstLeg,
                    secondLeg,
                    color);
            case ISOSCELES_TRAPEZOID:default: 
                double topBase = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                double bottomBase = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                double height = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new IsoscelesTrapezoid(topBase,
                    bottomBase,
                    height,
                    color); 
        }
    }
}
