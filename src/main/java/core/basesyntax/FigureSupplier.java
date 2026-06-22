package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 30;
    private static final int DEFAULT_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        int size1 = randomSize();
        int size2 = randomSize();
        int size3 = randomSize();

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
                throw new IllegalStateException("Unknown figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_SIZE);
    }

    private int randomSize() {
        return random.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
    }
}
