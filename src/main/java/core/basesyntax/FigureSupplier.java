package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final TypeSupplier typesSupplier = new TypeSupplier();

    public Figure getRandomFigure() {
        switch (typesSupplier.getRandomType()) {
            case CIRCLE: {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1); }
            case SQUARE: {
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1); }
            case TRIANGLE: {
                return new Triangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1); }
            default: {
                return new Circle("WHITE", 10); }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
