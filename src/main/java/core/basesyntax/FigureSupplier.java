package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int DEFAULT_NUMBER = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int randomRadius() {
        return random.nextInt(DEFAULT_NUMBER);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURES);
        String color = colorSupplier.getRandomColor();

        return switch (index) {
            case 0 -> new Circle(color, randomRadius());
            case 1 -> new IsoscelesTrapezoid(color, randomRadius(), randomRadius(), randomRadius());
            case 2 -> new Rectangle(color, randomRadius(), randomRadius());
            case 3 -> new RightTriangle(color, randomRadius(), randomRadius());
            case 4 -> new Square(color, randomRadius());
            default -> new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }

}
