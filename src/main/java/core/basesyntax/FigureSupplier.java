package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int RANDOM_FIGURE_RANGE_PARAMETER = 100;
    private static final int INITIAL_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int numberOfFigure = random.nextInt(FIGURES_COUNT);
        String randomColor = colorSupplier.getRandomColor();

        switch (numberOfFigure) {
            case 0: {
                return new CircleFigure(randomColor, getRandomValueForFigureParameter());
            }
            case 1: {
                return new IsoscelesTrapezoidFigure(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            case 2: {
                return new RectangleFigure(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            case 3: {
                return new RightTriangleFigure(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            default: {
                return new SquareFigure(randomColor,
                        getRandomValueForFigureParameter());
            }
        }
    }

    private double getRandomValueForFigureParameter() {
        return random.nextDouble(RANDOM_FIGURE_RANGE_PARAMETER);
    }

    public AbstractFigure getDefaultFigure() {
        return new CircleFigure(colorSupplier.getRandomColor(), INITIAL_CIRCLE_RADIUS);
    }
}
