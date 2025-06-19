package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String defaultColor = "white";
    private final int defaultRadius = 10;

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0: return new Square(color, random.nextInt(MAX_VALUE) + 1);
            case 1: return new Circle(color, random.nextInt(MAX_VALUE) + 1);
            case 2: return new Rectangle(color, random.nextInt(MAX_VALUE)
                    + 1, random.nextInt(MAX_VALUE) + 1);
            case 3: return new RightTriangle(color, random.nextInt(MAX_VALUE)
                    + 1, random.nextInt(MAX_VALUE) + 1);
            default: return new IsoscelesTrapezoid(color, random.nextInt(MAX_VALUE)
                    + 1, random.nextInt(MAX_VALUE) + 1, random.nextInt(MAX_VALUE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
