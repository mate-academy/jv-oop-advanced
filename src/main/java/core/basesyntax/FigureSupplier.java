package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INT_BOUND = 100;
    private static final int MAX_VALUE_SWITCH = 4;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int indexFigure = random.nextInt(MAX_VALUE_SWITCH);
        switch (indexFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt(), getRandomInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 4:

            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    public Figure getDefaultFigure() {
        final int radius = 10;
        return new Circle(Color.WHITE.name(), radius);
    }

    private int getRandomInt() {
        return random.nextInt(INT_BOUND);
    }
}
