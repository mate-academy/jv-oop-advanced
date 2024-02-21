package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int ORIGIN = 1;
    private static final int BOUND = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomInt() {
        return random.nextInt(ORIGIN, BOUND);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(Shape.values().length);
        Shape shape = Shape.values()[index];
        switch (shape.name()) {
            case "CIRCLE" :
                return new Circle(getRandomInt(), colorSupplier.getRandomColor());
            case "ISOSCELES_TRAPESOID" :
                return new IsoscelesTrapezoid(getRandomInt(), getRandomInt(), getRandomInt(),
                        colorSupplier.getRandomColor());
            case "SQUARE" :
                return new Square(getRandomInt(), colorSupplier.getRandomColor());
            case "RECTANGLE" :
                return new RightTriangle(getRandomInt(), getRandomInt(),
                        colorSupplier.getRandomColor());
            default:
                return new RightTriangle(getRandomInt(), getRandomInt(),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
