package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Drawable getRandomFigure() {
        return switch (random.nextInt(FIGURES_COUNT)) {
            case 0 -> new Circle(10, colorSupplier.getRandomColor());
            case 1 -> new Square(5, colorSupplier.getRandomColor());
            case 2 -> new Rectangle(3, 7, colorSupplier.getRandomColor());
            case 3 -> new RightTriangle(5, 9, colorSupplier.getRandomColor());
            default -> new IsoscelesTrapezoid(4, 6, 5, colorSupplier.getRandomColor());
        };
    }

    public Drawable getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
