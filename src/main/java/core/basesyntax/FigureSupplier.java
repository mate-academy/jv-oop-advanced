package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        Color randomColor = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(randomColor, getRandomValue());
            case 1 -> new Rectangle(randomColor,
                    getRandomValue(), getRandomValue());
            case 2 -> new RightTriangle(randomColor,
                    getRandomValue(), getRandomValue());
            case 3 -> new Circle(randomColor, getRandomValue());
            case 4 -> new IsoscelesTrapezoid(randomColor,
                    getRandomValue(), getRandomValue(), getRandomValue());
            default -> throw new IllegalStateException("Unknown figure type");
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_FIGURE_RADIUS);
    }

    private double getRandomValue() {
        return 1 + random.nextDouble() * 99;
    }
}
