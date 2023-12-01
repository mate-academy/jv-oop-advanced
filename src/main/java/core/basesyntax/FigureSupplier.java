package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private static final int BOUND = 10;//Setting Figure's side bound to avoid huge numbers
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        if (index == 1) {
            int side = random.nextInt(BOUND) + 1;
            return new Square(side, colorSupplier.getRandomColor());
        }
        if (index == 2) {
            int height = random.nextInt(BOUND) + 1;
            int width = random.nextInt(BOUND) + 1;
            return new Rectangle(height, width, colorSupplier.getRandomColor());
        }
        if (index == 3) {
            int side = random.nextInt(BOUND) + 1;
            int height = random.nextInt(BOUND) + 1;
            return new RightTriangle(side, height, colorSupplier.getRandomColor());
        }
        if (index == 4) {
            int radius = random.nextInt(BOUND) + 1;
            return new Circle(radius, colorSupplier.getRandomColor());
        }
        int height = random.nextInt(BOUND) + 1;
        int firstParallel = random.nextInt(BOUND) + 1;
        int secondParallel = random.nextInt(BOUND) + 1;
        return new IsoscelesTrapezoid(height, firstParallel, secondParallel,
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
