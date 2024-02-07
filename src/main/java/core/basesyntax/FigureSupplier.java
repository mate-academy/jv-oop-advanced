package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_VALUE = 10.0;
    private static final double LENGHT = 50.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getFigureType() {
        int numberOfTypes = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[numberOfTypes]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), randomValue());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), randomValue());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), randomValue(), randomValue());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), randomValue());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomValue(), randomValue(), randomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_VALUE);
    }

    private double randomValue() {
        return random.nextDouble() * LENGHT;
    }
}
