package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    public static final int MAX_VALUE_SIDE = 50;
    private static final int MAX_FIGURE = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int count = random.nextInt(MAX_FIGURE);
        int randomNumber = random.nextInt(MAX_VALUE_SIDE);
        switch (count) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), randomNumber);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), randomNumber, randomNumber);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomNumber, randomNumber);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNumber, randomNumber, randomNumber);
            default:
                return new Square(colorSupplier.getRandomColor(), randomNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
