package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_COUNT = 5;
    private static final int MAX_PARAMETER = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(MAX_FIGURE_COUNT);

        return switch (randomFigure) {
            case 0 -> new Square(random.nextInt(MAX_PARAMETER), colorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextInt(MAX_PARAMETER), random.nextInt(MAX_PARAMETER),
                            colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextInt(MAX_PARAMETER),
                            random.nextInt(MAX_PARAMETER),
                            colorSupplier.getRandomColor());
            case 3 -> new Circle(random.nextInt(MAX_PARAMETER), colorSupplier.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextInt(MAX_PARAMETER),
                            random.nextInt(MAX_PARAMETER), random.nextInt(MAX_PARAMETER),
                            colorSupplier.getRandomColor());
            default -> null;
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
