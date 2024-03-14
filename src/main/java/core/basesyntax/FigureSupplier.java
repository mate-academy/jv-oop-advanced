package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int figuresCount = 5;
    private static final int randomFigureRangeParameter = 100;
    private static final int initialCircleRadius = 10;
    private final Random random = new Random();

    public AbstractFigure getRandomFigure() {
        int numberOfFigure = random.nextInt(figuresCount);
        String randomColor = ColorSupplier.getRandomColor();

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
        return random.nextDouble(randomFigureRangeParameter);
    }

    public AbstractFigure getDefaultFigure() {
        return new CircleFigure(ColorSupplier.getRandomColor(), initialCircleRadius);
    }
}
