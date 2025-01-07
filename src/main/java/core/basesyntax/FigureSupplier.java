package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final static int MAX_DIMENSION = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        switch (type) {
            case 0: return new Square(random.nextInt(MAX_DIMENSION) + 1, color);
            case 1: return new Rectangle(random.nextInt(MAX_DIMENSION) + 1, random.nextInt(MAX_DIMENSION) + 1, color);
            case 2: return new RightTriangle(random.nextInt(MAX_DIMENSION) + 1, random.nextInt(MAX_DIMENSION) + 1, color);
            case 3: return new Circle(random.nextInt(MAX_DIMENSION) + 1, color);
            case 4: return new IsoscelesTrapezoid(random.nextInt(MAX_DIMENSION) + 1, random.nextInt(MAX_DIMENSION) + 1, random.nextInt(MAX_DIMENSION) + 1, color);
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_DIMENSION, Color.WHITE);
    }
}
