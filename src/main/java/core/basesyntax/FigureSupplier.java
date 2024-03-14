package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int figuresCount = 5;
    private static final int randomFigureRangeParameter = 100;
    private static final int initialCircleRadius = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(figuresCount);
        String randomColor = ColorSupplier.getRandomColor();

        switch (numberOfFigure) {
            case 0: {
                return new Circle(randomColor, getRandomValueForFigureParameter());
            }
            case 1: {
                return new IsoscelesTrapezoid(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            case 2: {
                return new Rectangle(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            case 3: {
                return new RightTriangle(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            default: {
                return new Square(randomColor,
                        getRandomValueForFigureParameter());
            }
        }
    }

    private double getRandomValueForFigureParameter() {
        return random.nextDouble(randomFigureRangeParameter);
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorSupplier.getRandomColor(), initialCircleRadius);
    }
}
