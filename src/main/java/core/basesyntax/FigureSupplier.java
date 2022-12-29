package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private static final int FIGURES_AMOUNT = 5;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_AMOUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);
        }
    }
}
