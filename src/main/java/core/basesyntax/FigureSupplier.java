package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNTER = 5;
    private static final int VALUE_COUNTER = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNTER)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(VALUE_COUNTER));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(VALUE_COUNTER), random.nextInt(VALUE_COUNTER),
                        random.nextInt(VALUE_COUNTER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(VALUE_COUNTER), random.nextInt(VALUE_COUNTER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(VALUE_COUNTER), random.nextInt(VALUE_COUNTER));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(VALUE_COUNTER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
