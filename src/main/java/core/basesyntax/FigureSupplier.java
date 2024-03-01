package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURES = 5;
    private static final int MAX_VALUE = 100;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final String COLOR = colorSupplier.getRandomColor();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int indexRandomFigure = random.nextInt(COUNT_FIGURES);
        int randomValue = random.nextInt(MAX_VALUE);
        return switch (indexRandomFigure) {
            case 0 -> new Circle(randomValue, COLOR);
            case 1 -> new Square(randomValue, COLOR);
            case 2 -> new Rectangle(randomValue, randomValue, COLOR);
            case 3 -> new RightTriangle(randomValue, randomValue, COLOR);
            case 4 -> new IsoscelesTrapezoid(randomValue, randomValue, randomValue, COLOR);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"White");
    }

}
