package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        final ColorSupplier colorSupplier = new ColorSupplier();

        int figureIndex = random.nextInt(DEFAULT_RADIUS);
        return switch (figureIndex) {
            case 0 -> new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            case 1 -> new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case 2 -> new Rectangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 3 -> new RightTriangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 4 ->
                    new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                            random.nextDouble(), colorSupplier.getRandomColor());
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, MyColor.WHITE);
    }
}
