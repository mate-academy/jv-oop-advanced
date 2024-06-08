package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_PARAMETER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomFigureParameter() {
        return random.nextInt(FIGURE_PARAMETER);
    }

    public Figure getRandomFigure() {
        final String color = colorSupplier.getRandomColor();
        int index = random.nextInt(FIGURE_COUNT);
        return switch (index) {
            case 0 -> new Circle(color, getRandomFigureParameter());
            case 1 -> new IsoscelesTrapezoid(color, getRandomFigureParameter(),
                    getRandomFigureParameter(), getRandomFigureParameter());
            case 2 -> new Rectangle(color, getRandomFigureParameter(), getRandomFigureParameter());
            case 3 -> new Square(color, getRandomFigureParameter());
            default -> new RightTriangle(color, getRandomFigureParameter(),
                    getRandomFigureParameter());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
