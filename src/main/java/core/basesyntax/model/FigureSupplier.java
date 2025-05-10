package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int VALUE_COUNT = 3942;

    public Figure getRandomFigure() {
        switch (new Random().nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(VALUE_COUNT));
            case 1:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(VALUE_COUNT), new Random().nextInt(VALUE_COUNT),
                        new Random().nextInt(VALUE_COUNT), new Random().nextInt(VALUE_COUNT),
                        new Random().nextInt(VALUE_COUNT));
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(VALUE_COUNT),
                        new Random().nextInt(VALUE_COUNT));
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(VALUE_COUNT),new Random().nextInt(VALUE_COUNT));
            default:
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(VALUE_COUNT));
        }
    }
}
