package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_LENGTH_MAX = 7;
    private static final Color FINAL_CIRCLE_COLOR = Color.WHITE;
    private static final double CIRCLE_RADIUS = 10.00;
    private static final Figure FINAL_CIRCLE = new Circle(FINAL_CIRCLE_COLOR, CIRCLE_RADIUS);
    private static final int NO_RANDOM_ZERO = 1;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        double randomFirstValue = random.nextInt(FIGURE_LENGTH_MAX) + NO_RANDOM_ZERO;
        double randomSecondValue = random.nextInt(FIGURE_LENGTH_MAX) + NO_RANDOM_ZERO;
        double randomThirdValue = random.nextInt(FIGURE_LENGTH_MAX) + NO_RANDOM_ZERO;
        switch (randomFigureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        randomFirstValue);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        randomFirstValue);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomFirstValue, randomSecondValue);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomFirstValue, randomSecondValue);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomFirstValue, randomSecondValue, randomThirdValue);
            default: return FINAL_CIRCLE;
        }
    }

    public Figure getDefaultFigure() {
        return FINAL_CIRCLE;
    }
}


