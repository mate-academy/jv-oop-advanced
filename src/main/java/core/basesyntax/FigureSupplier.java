package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int RANDOM_FIGURE_CHOOSE = 5;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final String CIRCLE_DEFAULT_COLOR = Color.WHITE.name();

    // maybe it should be optimized somehow
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int choose = random.nextInt(RANDOM_FIGURE_CHOOSE);
        switch (choose) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                           random.nextInt(MAX_RANDOM_NUMBER));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                           random.nextInt(MAX_RANDOM_NUMBER),
                           random.nextInt(MAX_RANDOM_NUMBER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                           random.nextInt(MAX_RANDOM_NUMBER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                           random.nextInt(MAX_RANDOM_NUMBER));
            default:
                //due to simplification, does not always correctly display the area
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                           random.nextInt(MAX_RANDOM_NUMBER),
                           random.nextInt(MAX_RANDOM_NUMBER),
                           random.nextInt(MAX_RANDOM_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_DEFAULT_COLOR, CIRCLE_DEFAULT_RADIUS);
    }
}
