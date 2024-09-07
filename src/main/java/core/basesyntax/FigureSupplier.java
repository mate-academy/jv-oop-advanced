package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int maxFigure = 5;
    private final int defaultNumber = 10;
    private final String defaultColor = "WHITE";

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandom() {
        return random.nextInt(9) + 1;
    }
    
    public Figure getRandomFigure() {
        int index = random.nextInt(maxFigure);
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
        return new Circle(defaultColor, defaultNumber);
    }
}
