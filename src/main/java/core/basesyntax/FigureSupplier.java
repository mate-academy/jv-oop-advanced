package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURE_TYPES = 5;
    private static final int WHITE_CIRCLE_RADIUS = 10;

    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Color colorName = colorSupplier.getRandomColor();
        Random random = new Random();
        int choice = random.nextInt(NUM_FIGURE_TYPES);
        return switch (choice) {
            case 0 -> new Square(colorName, random.nextDouble() * 10 + 1);
            case 1 -> new Rectangle(colorName, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 2 -> new RightTriangle(colorName, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 3 -> new Circle(colorName, random.nextDouble() * 10 + 1);
            case 4 -> new IsoscelesTrapezoid(colorName, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, WHITE_CIRCLE_RADIUS);
    }
}
