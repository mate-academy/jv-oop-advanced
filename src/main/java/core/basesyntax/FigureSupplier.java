package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int MAX_FIGURE = 5;
    private final int DEFAULT_NUMBER = 10;
    private final String DEFAULT_COLOR = "WHITE";

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandom() {
        return random.nextInt(9) + 1;
    }
    
    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURE);
        String color = colorSupplier.getRandomColor();

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
