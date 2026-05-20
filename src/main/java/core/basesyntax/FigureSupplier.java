package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_SIDE_LENGTH = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        Color color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Circle(color, getRandomSide());
            case 1 -> new Square(color, getRandomSide());
            case 2 -> new Rectangle(color, getRandomSide(), getRandomSide());
            case 3 -> new RightTriangle(color, getRandomSide(), getRandomSide());
            default -> new IsoscelesTrapezoid(color, getRandomSide(), getRandomSide(),
                    getRandomSide());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_SIDE_LENGTH);
    }

    private int getRandomSide() {
        return random.nextInt(MAX_SIDE_LENGTH) + 1; // від 1 до 10
    }
}
