package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 1:
                return new Circle(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
