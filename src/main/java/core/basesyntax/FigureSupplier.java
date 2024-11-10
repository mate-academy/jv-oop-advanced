package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        return switch (random.nextInt(5)) {
            case 0 -> new Square(color, random.nextDouble() * MAX_SIZE);
            case 1 -> new Rectangle(color,
                    random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE);
            case 2 -> new RightTriangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 3 -> new Circle(color, random.nextDouble() * MAX_SIZE);
            default ->
                    new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
