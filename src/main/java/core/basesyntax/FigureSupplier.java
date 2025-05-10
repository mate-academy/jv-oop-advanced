package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    public static final int radius = 10;
    private final int figureCount = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int randomValue = random.nextInt(figureCount);
        int index = random.nextInt(figureCount);
        switch (index) {
            case 0:
                return new Circle(color, randomValue);
            case 1:
                return new Square(color, randomValue);
            case 2:
                return new Rectangle(color, randomValue, randomValue);
            case 3:
                return new RightTriangle(color, randomValue, randomValue);
            default:
                throw new IllegalArgumentException("Invalid index value");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", radius);
    }
}
