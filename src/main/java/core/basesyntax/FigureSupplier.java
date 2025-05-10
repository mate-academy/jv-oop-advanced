package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Random RANDOM = new Random();
    private static final int CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int firstParam = RANDOM.nextInt(100);
        int secondParam = RANDOM.nextInt(200);
        Color colorParam = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(FIGURE_COUNT);
        return switch (number) {
            case 1 -> new Circle(firstParam, colorParam);
            case 2 -> {
                double side = RANDOM.nextDouble(100);
                yield new IsoscelesTrapezoid(firstParam, secondParam, side, colorParam);
            }
            case 3 -> new Rectangle(firstParam, secondParam, colorParam);
            case 4 -> new RightTriangle(firstParam, secondParam, colorParam);
            default -> new Square(firstParam, colorParam);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.white);
    }
}
