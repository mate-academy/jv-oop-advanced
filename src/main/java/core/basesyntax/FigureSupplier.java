package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURES = 5;
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexRandomFigure = random.nextInt(COUNT_FIGURES);
        int randomValue = random.nextInt(MAX_VALUE);
        return switch (indexRandomFigure) {
            case 0 -> new Circle(randomValue, colorSupplier.getRandomColor());
            case 1 -> new Square(randomValue, colorSupplier.getRandomColor());
            case 2 -> new Rectangle(randomValue, randomValue, colorSupplier.getRandomColor());
            case 3 -> new RightTriangle(randomValue, randomValue, colorSupplier.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(randomValue, randomValue, randomValue, colorSupplier.getRandomColor());
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"White");
    }

}
