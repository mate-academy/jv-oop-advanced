package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
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
        int radiusCircle = 10;
        return new Circle(radiusCircle, "white");
    }
}
