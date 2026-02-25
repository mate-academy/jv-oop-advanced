package core.basesyntax;
import java.util.Random;

class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(5); // 0..4

        String color = colorSupplier.getRandomColor();
        double a = 2 + random.nextDouble() * 18; // 2..20

        return switch (type) {
            case 0 -> new Circle(a, color);
            case 1 -> new Square(a, color);
            case 2 -> new Rectangle(a, 3 + random.nextDouble() * 17, color);
            case 3 -> new RightTriangle(a, 3 + random.nextDouble() * 12, color);
            default -> { // case 4
                double baseA = 8 + random.nextDouble() * 12;
                double baseB = 3 + random.nextDouble() * (baseA - 5);
                double h = 4 + random.nextDouble() * 10;
                yield new IsoscelesTrapezoid(baseA, baseB, h, color);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10.0, "white");
    }
}
