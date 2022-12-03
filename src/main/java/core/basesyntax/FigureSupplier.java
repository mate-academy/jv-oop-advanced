package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int DEFAULT_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(random.nextInt(DEFAULT_BOUND) + 1, color.getRandomColor());
            case 1:
                return new Square(random.nextInt(DEFAULT_BOUND) + 1, color.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(DEFAULT_BOUND) + 1,
                        random.nextInt(DEFAULT_BOUND) + 1, color.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(DEFAULT_BOUND) + 1,
                        random.nextInt(DEFAULT_BOUND) + 1, color.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(DEFAULT_BOUND) + 1,
                        random.nextInt(DEFAULT_BOUND) + 1,
                        random.nextInt(DEFAULT_BOUND) + 1,
                        color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
    }
}
