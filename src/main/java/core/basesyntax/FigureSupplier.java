package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final int FIGURE_TYPES = 5;
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_SIZE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        // Generate random dimensions
        int size1 = random.nextInt(MAX_SIZE) + 1;
        int size2 = random.nextInt(MAX_SIZE) + 1;
        int size3 = random.nextInt(MAX_SIZE) + 1;

        int figureType = random.nextInt(FIGURE_TYPES);

        switch (figureType) {
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
}
