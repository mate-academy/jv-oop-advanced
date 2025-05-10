package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUE = 11;
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomValue = random.nextInt(MAX_VALUE);
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: {
                return new Circle(colorSupplier.getRandomColor(), randomValue);
            }
            case 1: {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomValue, randomValue, randomValue);
            }
            case 2: {
                return new Rectangle(colorSupplier.getRandomColor(), randomValue, randomValue);
            }
            case 3: {
                return new RightTriangle(colorSupplier.getRandomColor(), randomValue, randomValue);
            }
            default: {
                return new Square(colorSupplier.getRandomColor(), randomValue);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
