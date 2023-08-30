package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 5;
    private static final int MAX_PARAMETR = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(MAX_NUMBER)) {
            case 0:
                return new Circle(color, getRandomValue());
            case 1:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
            case 2:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            default:
                return new Square(color, getRandomValue());
        }
    }

    private int getRandomValue() {
        return random.nextInt(MAX_PARAMETR) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
