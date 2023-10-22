package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int radiusOfCircle = 10;

    public Figure getRandomFigure() {
        int radius = random.nextInt(1,10);
        int sideA = random.nextInt(1,10);
        int sideB = random.nextInt(1,10);
        int height = random.nextInt(1, 10);
        int index = random.nextInt(1, 5);
        return switch (index) {
            case 1 -> new Square(sideA,
                    colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(sideA, sideB,
                    colorSupplier.getRandomColor());
            case 3 -> new Circle(radius,
                    colorSupplier.getRandomColor());
            case 4 -> new Rectangle(sideA, sideB,
                    colorSupplier.getRandomColor());
            case 5 -> new IsoscelesTrapezoid(sideA, sideB,
                    height, colorSupplier.getRandomColor());
            default -> null;
        };
    }

    public Figure getDefault() {
        return new Circle(radiusOfCircle,
                Color.WHITE.toString().toLowerCase());
    }
}
