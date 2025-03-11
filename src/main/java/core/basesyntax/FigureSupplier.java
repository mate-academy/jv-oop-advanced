package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final double DEFAULT_RADIUS = 10.0d;
    private static final int FIGURE_INDEX = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        final int maxValue = 100;
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_INDEX);
        switch (figureType) {
            case 0: return new Circle(color, Math.round(random.nextDouble(maxValue)));
            case 1: return new Square(color, Math.round(random.nextDouble(maxValue)));
            case 2: return new Rectangle(color,
                        Math.round(random.nextDouble(maxValue)),
                        Math.round(random.nextDouble(maxValue)));
            case 3: return new RightTriangle(color,
                        Math.round(random.nextDouble(maxValue)),
                        Math.round(random.nextDouble(maxValue)));
            case 4: return new IsoscelesTrapezoid(color,
                        Math.round(random.nextDouble(maxValue)),
                        Math.round(random.nextDouble(maxValue)),
                        Math.round(random.nextDouble(maxValue)));
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
