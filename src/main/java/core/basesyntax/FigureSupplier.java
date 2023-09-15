package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURE_TYPES = 5;
    private static final double SIDE_LIMIT = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomType = random.nextInt(NUM_FIGURE_TYPES);
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randomType) {
            case 0:
                return new Square(getR, randomColor);
            case 1:
                return new Rectangle(random.nextDouble() * 10,
                        random.nextDouble() * 10, randomColor);
            case 2:
                return new RightTriangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, randomColor);
            case 3:
                return new Circle(random.nextDouble() * 10, randomColor);
            default:;
                return new IsoscelesTrapezoid(
                        random.nextDouble() * 10, random.nextDouble() * 10,
                        random.nextDouble() * 10, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
