package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_UNITS = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_UNITS = 10;

    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_UNITS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int figureIndex = randomizer.nextInt(FIGURE_COUNT);

        switch (figureIndex) {
            case 0:
                int radius = randomizer.nextInt(MAX_UNITS);
                return new Circle(radius, colorSupplier.getRandomColor());
            case 1:
                int topBase = randomizer.nextInt(MAX_UNITS);
                int bottomBase = randomizer.nextInt(MAX_UNITS);
                int height = randomizer.nextInt(MAX_UNITS);
                return new IsoscelesTrapezoid(topBase, bottomBase, height,
                        colorSupplier.getRandomColor());

            case 2:
                int width = randomizer.nextInt(MAX_UNITS);
                int length = randomizer.nextInt(MAX_UNITS);
                return new Rectangle(width, length, colorSupplier.getRandomColor());

            case 3:
                int firstLeg = randomizer.nextInt(MAX_UNITS);
                int secondLeg = randomizer.nextInt(MAX_UNITS);
                return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());

            case 4:
                int side = randomizer.nextInt(MAX_UNITS);
                return new Square(side, colorSupplier.getRandomColor());

            default:
                return getDefaultFigure();
        }
    }
}
