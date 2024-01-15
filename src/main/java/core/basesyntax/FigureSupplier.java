package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INTEGER_RANDOM_VALUE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_INTEGER_RANDOM_VALUE);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}
