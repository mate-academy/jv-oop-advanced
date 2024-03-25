package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_INT = 100;
    private static final double MAX_RANDOM_DOUBLE = 100.0;
    private static final int DEFAULT_FIGURE_SIDE = 10;
    private static final int MAX_FIGURE_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(MAX_FIGURE_NUMBER);
        switch (figure) {
            case 0: return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble(),
                    getRandomDouble());
            case 2: return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble());
            case 3: return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble());
            default: return new Square(colorSupplier.getRandomColor(),
                    getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_FIGURE_SIDE);
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_RANDOM_INT);
    }

    private double getRandomDouble() {
        return new Random().nextDouble(MAX_RANDOM_DOUBLE);
    }
}
