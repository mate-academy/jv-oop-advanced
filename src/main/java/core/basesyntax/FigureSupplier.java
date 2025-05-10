package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 25;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int value = random.nextInt(MAX_VALUE);
        switch (figureNumber) {
            case 1:
                return new Square(color.getRandomColor(), value);
            case 2:
                return new Circle(color.getRandomColor(), value);
            case 3:
                return new IsoscelesTrapezoid(color.getRandomColor(), value, value, value);
            case 4:
                return new RightTriangle(color.getRandomColor(), value, value);
            default:
                return new Rectangle(color.getRandomColor(), value, value);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
