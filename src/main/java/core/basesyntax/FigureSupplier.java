package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURES = 5;
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int indexRandomFigure = random.nextInt(COUNT_FIGURES);
        int randomValue = random.nextInt(MAX_VALUE);
        return switch (indexRandomFigure) {
            case 0 -> new Circle(randomValue, randomColor);
            case 1 -> new Square(randomValue, randomColor);
            case 2 -> new Rectangle(randomValue, randomValue, randomColor);
            case 3 -> new RightTriangle(randomValue, randomValue, randomColor);
            case 4 -> new IsoscelesTrapezoid(randomValue, randomValue, randomValue, randomColor);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE,DEFAULT_COLOR);
    }

}
