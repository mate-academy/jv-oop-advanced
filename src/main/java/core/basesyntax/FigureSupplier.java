package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_CLASSES = 5;
    private static final double MAX_SIZE = 100.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final Colour DEFAULT_COLOUR = Colour.WHITE;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    private double getRandomDoubleValue() {
        return random.nextDouble() * MAX_SIZE;
    }

    public Figure getRandomFigure() {
        int id = random.nextInt(NUMBER_OF_CLASSES);
        switch (id) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomDoubleValue());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDoubleValue(),
                        getRandomDoubleValue());
            case 2:
                return new Circle(colorSupplier.getRandomColor(), getRandomDoubleValue());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDoubleValue(),
                        getRandomDoubleValue());
            default: break;
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDoubleValue(),
                getRandomDoubleValue(), getRandomDoubleValue());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOUR.getReadable(), DEFAULT_RADIUS);
    }
}
