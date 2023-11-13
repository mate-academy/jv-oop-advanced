package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10; // ✅ Перемістили вище
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5); // Випадковий вибір фігури
        String color = colorSupplier.getRandomColor();
        int size = random.nextInt(MAX_SIZE) + 1;

        switch (figureType) {
            case 0:
                return new Square(color, size);
            case 1:
                return new Rectangle(color, size, random.nextInt(MAX_SIZE) + 1);
            case 2:
                return new Circle(color, size);
            case 3:
                return new RightTriangle(color, size, random.nextInt(MAX_SIZE) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, size, random.nextInt(MAX_SIZE)
                        + 1, random.nextInt(MAX_SIZE) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
