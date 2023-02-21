package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPES = 5;
    private static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int typeIndex = random.nextInt(FIGURE_TYPES);
        switch (typeIndex) {
            case 0:
                return new Circle(random.nextInt(), colorSupplier.getRandomColor());
            case 1:
                return new Square(random.nextInt(), colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(random.nextInt(),
                        random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextInt(),
                        random.nextInt(), colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(random.nextInt(),
                        random.nextInt(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();

        }
    }
}
