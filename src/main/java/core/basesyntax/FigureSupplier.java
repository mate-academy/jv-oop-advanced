package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 101;
    private static final int COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(COUNT);
        Color color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                int radius = random.nextInt(MAX_VALUE);
                return new Circle(color, radius);
            case 1:
                int side = random.nextInt(MAX_VALUE);
                return new Square(color, side);
            case 2:
                int length = random.nextInt(MAX_VALUE);
                int width = random.nextInt(MAX_VALUE);
                return new Rectangle(color, length, width);
            case 3:
                int base = random.nextInt(MAX_VALUE);
                int height = random.nextInt(MAX_VALUE);
                return new RightTriangle(color, base, height);
            case 4:
                int longBase = random.nextInt(MAX_VALUE);
                int shortBase = random.nextInt(MAX_VALUE);
                int heightBase = random.nextInt(MAX_VALUE);
                return new IsoscelesTrapezoid(color, longBase, shortBase, heightBase);
            default:
                return getDefaultFigure();
        }
    }

    Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);

    }
}
