package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private static final double MAX_VALUE = 100;

    public double getValue() {
        return random.nextInt(100);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        for (int i = 0; i < FigureList.values().length; i++) {
            switch (FigureList.values()[index]) {
                case CIRCLE:
                    return new Circle(colorSupplier.getRandomColor(), getValue());
                case SQUARE:
                    return new Square(colorSupplier.getRandomColor(), getValue());
                case TRIANGLE:
                    return new RightTriangle(colorSupplier.getRandomColor(), getValue(), getValue());
                case RECTANGLE:
                    return new Rectangle(colorSupplier.getRandomColor(), getValue(), getValue());
            }
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getValue(), getValue(), getValue());
    }

    public Figure getDefaultFigure() {
        return new Circle("White",10);
    }
}
