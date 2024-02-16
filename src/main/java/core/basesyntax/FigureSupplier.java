package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int MAX_FIGURE_SIDE_LENGTH = 20;
    private static final int DEFAULT_FIGURE_SIDE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                return new Circle(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 1:
                return new Square(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 2:
                return new Rectangle(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 3:
                return new RightTriangle(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_FIGURE_SIDE);
    }
}
