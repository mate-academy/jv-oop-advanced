package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 1;
    private static final int FIVE_NUMBER = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIVE_NUMBER);
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Square(color, getRandomSize());
            case 1 -> new Rectangle(color, getRandomSize(), getRandomSize());
            case 2 -> new RightTriangle(color, getRandomSize(), getRandomSize());
            case 3 -> new Circle(color, getRandomSize());
            default -> new IsoscelesTrapezoid(
                    color,
                    getRandomSize(),
                    getRandomSize(),
                    getRandomSize());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_NUMBER);
    }

    private double getRandomSize() {
        return random.nextDouble() * MAX_NUMBER + MIN_NUMBER;
    }
}
