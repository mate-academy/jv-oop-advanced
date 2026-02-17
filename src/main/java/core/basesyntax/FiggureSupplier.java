package core.basesyntax;

import java.util.Random;

public class FiggureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (number) {
            case 0 -> {
                return new Square(1 + random.nextInt(10), color);
            }
            case 1 -> {
                return new Rectangle(1 + random.nextInt(10), 1 + random.nextInt(10), color);
            }
            case 2 -> {
                return new RightTriangle(1 + random.nextInt(10), 1 + random.nextInt(10), color);
            }
            case 3 -> {
                return new Circle(1 + random.nextInt(10), color);
            }
            case 4 -> {
                return new IsoscelesTrapezoid(1 + random.nextInt(10), 1 + random.nextInt(10), 1 + random.nextInt(10),
                        color);
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + number);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
