package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}



