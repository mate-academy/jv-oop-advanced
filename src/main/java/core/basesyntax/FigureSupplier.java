package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_RANDOM_VALUE = 10.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(color, getRandomValue());
            case 1:
                return new Square(color, getRandomValue());
            case 2:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomValue(), getRandomValue(), getRandomValue());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomValue() {
        return random.nextDouble() * MAX_RANDOM_VALUE;
    }
}
