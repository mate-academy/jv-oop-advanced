package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int MAX_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int randomInt = random.nextInt(FIGURE_COUNT);

    public Figure getRandomFigure() {
        switch (randomInt) {
            case 0:
                return new Square(random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND),
                        random.nextInt(MAX_BOUND), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name());
    }
}
