package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MIN_SIZE = 1.0;
    private static final double MAX_SIZE = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        double size1 = MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE);
        double size2 = MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE);
        double size3 = MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE);

        switch (type) {
            case 0:
                return new Circle(color, size1);
            case 1:
                return new Square(color, size1);
            case 2:
                return new Rectangle(color, size1, size2);
            case 3:
                return new RightTriangle(color, size1, size2);
            case 4:
                return new IsoscelesTrapezoid(color, size1, size2, size3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
