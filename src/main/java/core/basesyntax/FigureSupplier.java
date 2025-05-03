package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        return switch (random.nextInt(5)) {
            case 0 -> new Square(random.nextInt(MAX_SIZE) + 1, color);
            case 1 -> new Circle(random.nextInt(MAX_SIZE) + 1, color);
            case 2 -> new Rectangle(random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, color);
            case 3 -> new RightTriangle(random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, color);
            case 4 -> new IsoscelesTrapezoid(random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1, color);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
