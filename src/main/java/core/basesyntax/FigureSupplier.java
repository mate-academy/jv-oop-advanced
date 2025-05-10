package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = 5;
    private static final int DEFAULT_NUMBER = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandom() {
        return random.nextInt(9) + 1;
    }
    
    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURE);
        Color color = colorSupplier.getRandomColor();

        return switch (index) {
            case 0 -> new RightTriangle(color, getRandom(), getRandom());
            case 1 -> new IsoscelesTrapezoid(color, getRandom(), getRandom(), getRandom());
            case 2 -> new Square(color, getRandom());
            case 3 -> new Circle(color, getRandom());
            default -> new Rectangle(color, getRandom(), getRandom());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }
}
