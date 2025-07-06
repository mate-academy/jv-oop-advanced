import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_SIZE = 20;

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Square(random.nextInt(MAX_SIZE) + 1, color);
            case 1 -> new Rectangle(random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, color);
            case 2 -> new RightTriangle(random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, color);
            case 3 -> new Circle(random.nextInt(MAX_SIZE) + 1, color);
            default -> new IsoscelesTrapezoid(random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1,
                    color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}

