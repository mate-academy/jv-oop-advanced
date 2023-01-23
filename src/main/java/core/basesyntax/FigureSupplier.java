package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int UNITS_COUNT = 11;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0: {
                int side = random.nextInt(UNITS_COUNT);
                return new Square(side, color);
            }
            case 1: {
                int radius = random.nextInt(UNITS_COUNT);
                return new Circle(radius, color);
            }
            case 2: {
                int height = random.nextInt(UNITS_COUNT);
                int width = random.nextInt(UNITS_COUNT);
                return new Rectangle(height, width, color);
            }
            case 3: {
                int firstLeg = random.nextInt(UNITS_COUNT);
                int secondLeg = random.nextInt(UNITS_COUNT);
                return new RightTriangle(firstLeg, secondLeg, color);
            }
            default: {
                int upperBase = random.nextInt(UNITS_COUNT);
                int lowerBase = random.nextInt(UNITS_COUNT);
                int height = random.nextInt(UNITS_COUNT);
                return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
            }
        }
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        String color = Colors.WHITE.name().toLowerCase();
        return new Circle(radius, color);
    }
}
