package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = rand.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int exp = rand.nextInt(10) + 1;

        return switch (type) {
            case 0 -> new Circle(color, exp);
            case 1 -> new Square(color, exp);
            case 2 -> new Rectangle(color,
                    exp,
                    exp);
            case 3 -> new RightTriangle(color,
                    exp,
                    exp);
            default -> new IsoscelesTrapezoid(color,
                    exp,
                    exp);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
