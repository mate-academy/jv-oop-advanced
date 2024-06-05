package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int BOUND = 10;
    private static final int RADIUS = 10; // Default Circle radius
    private static final String COLOR = "WHITE"; // Default Circle color
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        return switch (figureType) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND) + 1);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND) + 1,
                    random.nextInt(BOUND) + 1);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND) + 1,
                    random.nextInt(BOUND) + 1);
            case 3 -> new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND) + 1);
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND) + 1,
                    random.nextInt(BOUND) + 1, random.nextInt(BOUND) + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }
}
