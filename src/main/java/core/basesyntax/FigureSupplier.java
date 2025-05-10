package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int FIGURES_AMOUNT = 5;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
