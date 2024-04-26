package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIZE_PARAMETERS = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_RADIUS);
    }

    public Figure getRandomFigure() {
        final Color color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Square(color, random.nextInt(MAX_SIZE_PARAMETERS));
            case 1:
                return new Rectangle(color, random.nextInt(MAX_SIZE_PARAMETERS),
                        random.nextInt(MAX_SIZE_PARAMETERS));
            case 2:
                return new RightTriangle(color, random.nextInt(MAX_SIZE_PARAMETERS),
                        random.nextInt(MAX_SIZE_PARAMETERS));
            case 3:
                return new Circle(color, random.nextInt(MAX_SIZE_PARAMETERS));
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_SIZE_PARAMETERS),
                        random.nextInt(MAX_SIZE_PARAMETERS), random.nextInt(MAX_SIZE_PARAMETERS));
            default:
                return null;
        }
    }
}
