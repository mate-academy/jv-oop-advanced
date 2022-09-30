package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_NUMBER = 5;
    public static final int DIMENSIONS_LIMITER = 50;
    private final Random random = new Random();
    private final ColorSupplier colors = new ColorSupplier();
    //private final String figureColor = colors;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_NUMBER);
        int randomDimension1 = random.nextInt(DIMENSIONS_LIMITER) + 1;
        int randomDimension2 = random.nextInt(DIMENSIONS_LIMITER) + 1;
        int randomDimension3 = random.nextInt(DIMENSIONS_LIMITER) + 1;
        String figureColor = String.valueOf(colors.getRandomColor());
        switch (figureNumber) {
            case (0):
                return new Circle(figureColor, randomDimension1);
            case (1):
                return new Square(figureColor, randomDimension1);
            case (2):
                return new RightTriangle(figureColor, randomDimension1, randomDimension2);
            case (3):
                return new Rectangle(figureColor, randomDimension1,randomDimension2);
            case (4):
                return new IsoscelesTrapezoid(figureColor, randomDimension1,
                        randomDimension2,randomDimension3);
            default: getDefaultFigure();
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
