package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_BOUND = 30;
    public static final int RADIUS = 10;

    public Figure getRandomFigure() {
        int figure = RANDOM.nextInt(FIGURE_COUNT) + 1;
        switch (figure) {
            case 1: {
                return new Circle(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND) + 1);
            }
            case 2: {
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND) + 1,
                        RANDOM.nextInt(MAX_BOUND) + 1,
                        RANDOM.nextInt(MAX_BOUND) + 1);
            }
            case 3: {
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND) + 1,
                        RANDOM.nextInt(MAX_BOUND) + 1);
            }
            case 4: {
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND) + 1,
                        RANDOM.nextInt(MAX_BOUND) + 1);
            }
            default: {
                return new Square(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND) + 1);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureColor.WHITE.name(), RADIUS);
    }
}
