package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURE_TYPES = 5;
    private static final String DEFAULT_COLOR = "white";

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(NUM_FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();
        switch (choice) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, color);
            case 1:
                return new Rectangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, color);
            case 2:
                return new RightTriangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, color);
            case 3:
                return new Circle(random.nextDouble() * 10 + 1, color);
            case 4:
                return new IsoscelesTrapezoid(
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, color);
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, DEFAULT_COLOR);
    }
}
