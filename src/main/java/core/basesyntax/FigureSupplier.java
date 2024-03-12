package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOUND_MAX = 10000;
    private static final int FIGURES_QUANTITY = 5;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[FIGURES_QUANTITY];
        int randomIndex = random.nextInt(figures.length);
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure randomFigure;
        randomFigure = switch (randomIndex) {
            case 0 -> figures[0] = new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX));
            case 1 -> figures[1] = new Square(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX));
            case 2 -> figures[2] = new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX));
            case 3 -> figures[3] = new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX));
            case 4 -> figures[4] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX));
            default -> null;
        };
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
