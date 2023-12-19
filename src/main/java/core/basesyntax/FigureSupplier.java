package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(NUMBER_OF_FIGURES);
        return switch (randomFigureNumber) {
            case 0 -> new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 3 -> new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            default -> new IsoscelesTrapezoid(random.nextDouble(),random.nextDouble(),
                    random.nextDouble(), colorSupplier.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
