package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int UNITS_COUNT = 11;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int radius = 10;
    private final String color = Color.WHITE.name().toLowerCase();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (getRandomInt(FIGURE_COUNT)) {
            case 0: {
                int side = getRandomInt(UNITS_COUNT);
                return new Square(side, color);
            }
            case 1: {
                int radius = getRandomInt(UNITS_COUNT);
                return new Circle(radius, color);
            }
            case 2: {
                int height = getRandomInt(UNITS_COUNT);
                int width = getRandomInt(UNITS_COUNT);
                return new Rectangle(height, width, color);
            }
            case 3: {
                int firstLeg = getRandomInt(UNITS_COUNT);
                int secondLeg = getRandomInt(UNITS_COUNT);
                return new RightTriangle(firstLeg, secondLeg, color);
            }
            default: {
                int upperBase = getRandomInt(UNITS_COUNT);
                int lowerBase = getRandomInt(UNITS_COUNT);
                int height = getRandomInt(UNITS_COUNT);
                return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
            }
        }
    }

    public int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public Figure getDefaultFigure() {
        return new Circle(radius, color);
    }
}
