package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURE_TYPES = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfFigureType = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();
        return switch (indexOfFigureType) {
            case 0 -> new Circle(color, random.nextDouble());
            case 1 -> new Square(color, random.nextDouble());
            case 2 -> new Rectangle(color, random.nextDouble(), random.nextDouble());
            case 3 -> new RightTriangle(color, random.nextDouble(), random.nextDouble());
            default -> new IsoscelesTrapezoid(color, random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
