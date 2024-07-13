package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RADIUS = 10;
    private static final int QUANTITY_FIGURE = 5;
    private static final int MIN_LENGTH_FIGURE = 1;
    private static final int MAX_LENGTH_FIGURE = 100;
    private static final String COLOR_CIRCLE = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = supplier.getRandomColor();
        int indexFigure = random.nextInt(QUANTITY_FIGURE);

        return switch (indexFigure) {
            case 0 -> new Circle(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
            );
            case 1 -> new IsoscelesTrapezoid(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
            );
            case 2 -> new Rectangle(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)

                    );
            case 3 -> new RightTriangle(
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    color
                        );
            default -> new Square(
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    color

                                );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_CIRCLE, MAX_RADIUS);
    }
}
