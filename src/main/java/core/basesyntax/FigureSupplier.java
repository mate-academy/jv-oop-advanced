package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN_VALUE = 1.0;
    private static final double MAX_VALUE = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public int getIndex() {
        return random.nextInt(NUMBER_OF_FIGURES);
    }

    public double generateAmount() {
        return random.nextDouble(MIN_VALUE, MAX_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (getIndex()) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        generateAmount());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        generateAmount(),
                        generateAmount(),
                        generateAmount());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        generateAmount(),
                        generateAmount());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        generateAmount(),
                        generateAmount());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        generateAmount());
        }
    }
}
