package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_DIMENSION_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "White";
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figureNumber) {
            case 0:
                return new Circle(random.nextInt(MAX_DIMENSION_VALUE),
                        colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(MAX_DIMENSION_VALUE),
                        random.nextInt(MAX_DIMENSION_VALUE), random.nextInt(MAX_DIMENSION_VALUE),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MAX_DIMENSION_VALUE),
                        random.nextInt(MAX_DIMENSION_VALUE), colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextInt(MAX_DIMENSION_VALUE),
                        random.nextInt(MAX_DIMENSION_VALUE), colorSupplier.getRandomColor());
            default:
                return new Square(random.nextInt(MAX_DIMENSION_VALUE),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
