package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int anInt = random.nextInt(5);
        return switch (anInt) {
            case 1 -> new Circle(Colors.WHITE.name(), 10);
            case 2 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(10), random.nextInt(10));
            case 3 -> new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                    random.nextInt(10));
            case 4 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10),
                    random.nextInt(10));
            default -> new Square(colorSupplier.getRandomColor(), random.nextInt(10),
                    random.nextInt(10));
        };
    }
}
