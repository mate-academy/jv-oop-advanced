package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANGE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getRandomFigure() {
        int randomNameFigure = random.nextInt(FIGURES_COUNT);
        switch (randomNameFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                random.nextInt(MAX_RANGE) + 1,
                                random.nextInt(MAX_RANGE) + 1,
                                random.nextInt(MAX_RANGE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
