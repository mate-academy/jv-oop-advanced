package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private double getRandomValue() {
        return random.nextDouble() * 10;
    }

    public Figure getRandomFigure() {
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
            case 1:
                return new Circle(color, getRandomValue());
            case 2:
                return new RightTriangle(color, getRandomValue(),
                        getRandomValue());
            case 3:
                return new Rectangle(color, getRandomValue(),
                        getRandomValue());
            default:
                return new Square(color, getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
