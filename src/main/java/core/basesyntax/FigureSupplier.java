package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 1;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int randomSize() {
        int size = random.nextInt(MAX_SIZE) + MIN_SIZE;
        return size;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(FIGURE_COUNT);
        switch (type) {
            case 0:
                int radius = randomSize();
                return new Circle(color, radius);
            case 1:
                int length = randomSize();
                int width = randomSize();
                return new Rectangle(color, length, width);
            case 2:
                int side = randomSize();
                return new Square(color, side);
            case 3:
                int firstLeg = randomSize();
                int secondLeg = randomSize();
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                int baseA = randomSize();
                int baseB = randomSize();
                int height = randomSize();
                return new IsoscelesTrapezoid(color, baseA, baseB, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_SIZE);
    }
}
