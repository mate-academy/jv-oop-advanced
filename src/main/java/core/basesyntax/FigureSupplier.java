package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final TypeSupplier types = new TypeSupplier();

    public Figure getRandomFigure() {
        switch (types.getRandomType()) {
            case CIRCLE: {
                return new Circle(color.getRandomColor(), random.nextInt(10) + 1); }
            case SQUARE: {
                return new Square(color.getRandomColor(), random.nextInt(10) + 1); }
            case TRIANGLE: {
                return new Triangle(color.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1); }
            default: { }
        }
        return new Figure();
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
