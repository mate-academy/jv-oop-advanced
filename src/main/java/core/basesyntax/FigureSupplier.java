package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_MAX_SIZE = 10;
    private final Random random;
    private final ColorSupplier supplier;

    public FigureSupplier(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Figure getRandomFigure() {
        Color color = supplier.getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                int radius = random.nextInt(FIGURE_MAX_SIZE);
                return new Circle(radius, color);
            case 1:
                int firstLeg = random.nextInt(FIGURE_MAX_SIZE);
                int secondLeg = random.nextInt(FIGURE_MAX_SIZE);
                return new RightTriangle(firstLeg, secondLeg, color);
            case 2:
                int side = random.nextInt(FIGURE_MAX_SIZE);
                return new Square(side, color);
            case 3:
                int firstSide = random.nextInt(FIGURE_MAX_SIZE);
                int secondSide = random.nextInt(FIGURE_MAX_SIZE);
                return new Rectangle(firstSide, secondSide, color);
            case 4:
            default:
                int hide = random.nextInt(FIGURE_MAX_SIZE);
                int lowerBase = random.nextInt(FIGURE_MAX_SIZE);
                int upperBase = random.nextInt(FIGURE_MAX_SIZE);
                return new IsoscelesTrapezoid(hide, lowerBase, upperBase, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
