package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 1;
    private static final int DEFAULT_VALUE = 10;
    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        switch (figureNumber) {
            case 1: {
                return new Circle(getRandomValue(), colorSupplier.getRandomColor());
            }
            case 2: {
                return new Square(getRandomValue(), colorSupplier.getRandomColor());
            }
            case 3: {
                return new Rectangle(getRandomValue(),
                        getRandomValue(),
                        colorSupplier.getRandomColor());
            }
            case 4: {
                return new IsoscelesTrapezoid(getRandomValue(),
                        getRandomValue(), getRandomValue(),
                        colorSupplier.getRandomColor());
            }
            case 5: {
                return new RightTriangle(getRandomValue(),
                        getRandomValue(),
                        colorSupplier.getRandomColor());
            }
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE, String.valueOf(Color.WHITE.name().toLowerCase()));
    }

    private int getRandomValue() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
