package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int BOUND = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = random.nextInt(BOUND);

        return switch (index) {
            case 0 -> new Circle(color, random.nextInt(MAX_SIZE) + 1);
            case 1 -> new IsoscelesTrapezoid(color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1);
            case 2 -> new Rectangle(color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1);
            case 3 -> new RightTriangle(color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1);
            default -> new Square(color, random.nextInt(MAX_SIZE) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
