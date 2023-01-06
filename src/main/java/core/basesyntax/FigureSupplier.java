package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private static final int FIGURE_COUNT = 5;
    private static final int VALUE_COUNT = 100;

    public Figure getRandomFigure() {
        int rnd = random.nextInt(FIGURE_COUNT);
        switch (rnd) {
            case 0:
                return new Circle(random.nextInt(VALUE_COUNT), color.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(VALUE_COUNT),
                        random.nextInt(VALUE_COUNT),
                        random.nextInt(VALUE_COUNT),
                        color.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(VALUE_COUNT),
                        random.nextInt(VALUE_COUNT),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(VALUE_COUNT),
                        random.nextInt(VALUE_COUNT),
                        color.getRandomColor());
            case 4:
                return new Square(random.nextInt(VALUE_COUNT), color.getRandomColor());
            default:
                getDefaultFigure();
        }
        return getDefaultFigure();
    }
    public Figure getDefaultFigure() {
        final int defaultValue= 10;
        return new Circle(defaultValue, Color.WHITE.name());
    }
}
