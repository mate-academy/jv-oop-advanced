package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 101;
    private static final int MAX_RADIUS = 51;
    private static final int DEFAULT_RADIUS = 10;
    private static final int SET_OF_FIGURES = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomSide() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(SET_OF_FIGURES);
        int radius = random.nextInt(MAX_RADIUS);
        String color = colorSupplier.getRandomColor();

        return switch (index) {
            case 0 -> new Circle(radius, color);
            case 1 -> new Square(color, getRandomSide());
            case 2 -> new IsoscelesTrapezoid(color, getRandomSide(), getRandomSide(),
                    getRandomSide());
            case 3 -> new Rectangle(color, getRandomSide(), getRandomSide());
            default -> new RightTriangle(color, getRandomSide(), getRandomSide());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
