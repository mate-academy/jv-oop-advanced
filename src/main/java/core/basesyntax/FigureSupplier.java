package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int MAX_RANDOM_VALUE = 20;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureIndex) {
            case 0:
                int side = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new Square(color, side);
            case 1:
                int radius = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new Circle(color, radius);
            case 2:
                int firstSide = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int secondSide = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new Rectangle(color, firstSide, secondSide);
            case 3:
                int firstLeg = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int secondLeg = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                int upperBase = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int lowerBase = random.nextInt(MAX_RANDOM_VALUE) + 1;
                int height = random.nextInt(MAX_RANDOM_VALUE) + 1;
                return new IsoscelesTrapezoid(color, upperBase, lowerBase, height);
        }
    }
}
