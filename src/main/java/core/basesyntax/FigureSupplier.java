package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static Random random = new Random();

    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_NUMBER);
        return switch (randomFigure) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextDouble());
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            case 2 -> new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            default -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
        };
    }
}
