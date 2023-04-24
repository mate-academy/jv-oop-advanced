package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RADIUS_OF_CIRCLE = 10;
    public static final int MAX_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {

        switch (random.nextInt(FIGURE_COUNT)) {
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
        return new Circle(RADIUS_OF_CIRCLE,"White");
    }
}

