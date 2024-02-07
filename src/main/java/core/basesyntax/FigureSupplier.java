package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int RADIUS = 10;
    private static final int MAX_FIGURE_TYPE_BOUND = 5;
    private static final int MAX_BOUND = 50;

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(MAX_FIGURE_TYPE_BOUND) + 1;
        switch (figureType) {
            case 1: {
                return new Circle(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND));
            }
            case 2: {
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND),
                        RANDOM.nextInt(MAX_BOUND));
            }
            case 3: {
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND),
                        RANDOM.nextInt(MAX_BOUND));
            }
            case 4: {
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        RANDOM.nextInt(MAX_BOUND),
                        RANDOM.nextInt(MAX_BOUND),
                        RANDOM.nextInt(MAX_BOUND));
            }
            default: {
                return new Square(new ColorSupplier().getRandomColor(), RANDOM.nextInt(MAX_BOUND));
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS);
    }
}
