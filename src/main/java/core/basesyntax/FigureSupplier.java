package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Enum DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_PROPERTY_NUMBER = 9;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandom() {
        return random.nextInt(MAX_PROPERTY_NUMBER) + 1;
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
        return new Circle(String.valueOf(DEFAULT_COLOR), DEFAULT_RADIUS);
    }
}
