package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 6;
    private static final int MAX_SIDE_LENGTH = 101;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 1 -> new Circle(getRandomSide(), color);
            case 2 -> new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                    getRandomSide(), color);
            case 3 -> new Rectangle(getRandomSide(), getRandomSide(), color);
            case 4 -> new RightTriangle(getRandomSide(), getRandomSide(), color);
            default -> new Square(getRandomSide(), color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int getRandomSide() {
        return random.nextInt(1, MAX_SIDE_LENGTH);
    }
}
