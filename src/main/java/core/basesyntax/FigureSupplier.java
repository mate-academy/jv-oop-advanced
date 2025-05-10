package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final double MIN_SIZE = 1;
    private static final int FIGURE_TYPES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE + MIN_SIZE);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE + MIN_SIZE,
                        random.nextDouble() * MAX_SIZE + MIN_SIZE);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE + MIN_SIZE,
                        random.nextDouble() * MAX_SIZE + MIN_SIZE);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE + MIN_SIZE);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE + MIN_SIZE,
                        random.nextDouble() * MAX_SIZE + MIN_SIZE,
                        random.nextDouble() * MAX_SIZE + MIN_SIZE);
            default:
                throw new IllegalStateException("Invalid figure type generated");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
