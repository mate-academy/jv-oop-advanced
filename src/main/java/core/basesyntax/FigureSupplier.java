package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    private static int MAX_VALUE = 100;
    private static int MIN_VALUE = 1;
    private static int DEFAULT_VALUE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomValue() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        switch (figureNumber)
        {
            case 1: {
                return new Circle(getRandomValue(), colorSupplier.getRandomColor());
            }
            case 2: {
                return new Square(getRandomValue(), colorSupplier.getRandomColor());
            }
            case 3: {
                return new Rectangle(getRandomValue(), getRandomValue(), colorSupplier.getRandomColor());
            }
            case 4: {
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(), getRandomValue(), colorSupplier.getRandomColor());
            }
            case 5: {
                return new RightTriangle(getRandomValue(), getRandomValue(), colorSupplier.getRandomColor());
            }
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, String.valueOf(Color.WHITE.name().toLowerCase()));
    }
}
