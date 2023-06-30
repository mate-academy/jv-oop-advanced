package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int DEFAULT_BOUND = 100;
    private static final String DEFAULT_COLOR = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Circle(random.nextInt(DEFAULT_BOUND), colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(random.nextInt(DEFAULT_BOUND),
                        random.nextInt(DEFAULT_BOUND), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(DEFAULT_BOUND), random.nextInt(DEFAULT_BOUND),
                        colorSupplier.getRandomColor());
            case 3:
                return new Square(random.nextInt(DEFAULT_BOUND), colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(DEFAULT_BOUND),
                        random.nextInt(DEFAULT_BOUND), random.nextInt(DEFAULT_BOUND),
                        colorSupplier.getRandomColor());
            default:
                return getDefoultFigure();
        }
    }

    public Figure getDefoultFigure() {
        Figure circle = new Circle(DEFAULT_RADIUS,DEFAULT_COLOR);
        return circle;
    }
}
