package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SEGMENT_LENGTH = 100;
    private static final int FIGURE_QUANTITY = 5;
    private static final int DEFAULT_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_QUANTITY)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SEGMENT_LENGTH));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SEGMENT_LENGTH),
                        random.nextInt(MAX_SEGMENT_LENGTH));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SEGMENT_LENGTH));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SEGMENT_LENGTH),
                        random.nextInt(MAX_SEGMENT_LENGTH));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SEGMENT_LENGTH),
                        random.nextInt(MAX_SEGMENT_LENGTH),
                        random.nextInt(MAX_SEGMENT_LENGTH));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_NUMBER);
    }
}
