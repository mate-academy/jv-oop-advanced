package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final int MAX_RANDOM = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor().name();
        double randomParameter = random.nextInt(MAX_RANDOM);
        int value = random.nextInt(FIGURE_COUNT);
        switch (value) {
            case 0:
                return new Square(color, randomParameter);
            case 1:
                return new Rectangle(color, randomParameter, randomParameter);
            case 2:
                return new RightTriangle(color, randomParameter, randomParameter);
            case 3:
                return new Circle(color, randomParameter);
            default:
                return new IsoscelesTrapezoid(color, randomParameter,
                        randomParameter, randomParameter);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), CIRCLE_RADIUS);
    }
}
