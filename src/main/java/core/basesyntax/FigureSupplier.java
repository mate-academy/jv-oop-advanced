package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;
    public static final int MAX_VALUE = 20;
    public static final int MAX_RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Color color = Color.valueOf(colorSupplier.getRandomColor().name());
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                int side = random.nextInt(MAX_VALUE);
                return new Square(color, side);
            case 1:
                int firstLeg = random.nextInt(MAX_VALUE);
                int secondLeg = random.nextInt(MAX_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 2:
                int width = random.nextInt(MAX_VALUE);
                int height = random.nextInt(MAX_VALUE);
                return new Rectangle(color, width, height);
            case 3:
                int upperBase = random.nextInt(MAX_VALUE);
                int lowerBase = random.nextInt(MAX_VALUE);
                height = random.nextInt(MAX_VALUE);
                return new IsoscelesTrapezoid(color, upperBase, lowerBase, height);
            default:
                int radius = random.nextInt(MAX_RADIUS);
                return new Circle(color, radius);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_RADIUS);
    }
}
