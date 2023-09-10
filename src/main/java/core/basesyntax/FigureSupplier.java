package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int randomSize() {
        return random.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), randomSize());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), randomSize(), randomSize());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), randomSize(),
                        randomSize());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), randomSize());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomSize(),
                        randomSize(), randomSize());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
