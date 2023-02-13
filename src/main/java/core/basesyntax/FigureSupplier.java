package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNTER = 5;
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = "WHITE";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNTER)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }
}
