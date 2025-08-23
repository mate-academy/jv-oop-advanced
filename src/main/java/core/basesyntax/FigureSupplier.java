package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_DIMENSION = 100;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        switch (figureType) {
            case 0:
                double radius = random.nextInt(MAX_DIMENSION) + 1;
                return new Circle(color, radius);
            case 1:
                double side = random.nextInt(MAX_DIMENSION) + 1;
                return new Square(color, side);
            case 2:
                double width = random.nextInt(MAX_DIMENSION) + 1;
                double height = random.nextInt(MAX_DIMENSION) + 1;
                return new Rectangle(color, width, height);
            case 3:
                double firstLeg = random.nextInt(MAX_DIMENSION) + 1;
                double secondLeg = random.nextInt(MAX_DIMENSION) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            default: // Case 4
                double upperBase = random.nextInt(MAX_DIMENSION) + 1;
                double lowerBase = random.nextInt(MAX_DIMENSION) + 1;
                double heightTrap = random.nextInt(MAX_DIMENSION) + 1;
                return new IsoscelesTrapezoid(color, upperBase, lowerBase, heightTrap);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
