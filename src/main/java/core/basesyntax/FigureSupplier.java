package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            default:
                return new Square(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}

