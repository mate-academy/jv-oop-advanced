package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_MODELS = 5;
    private static final int MAX_DIMENSION = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int dimension1 = random.nextInt(MAX_DIMENSION) + 1;
        int dimension2 = random.nextInt(MAX_DIMENSION) + 1;
        int dimension3 = random.nextInt(MAX_DIMENSION) + 1;

        switch (random.nextInt(NUMBER_OF_FIGURE_MODELS)) {
            case 0:
                return new Square(color, dimension1);
            case 1:
                return new Rectangle(color, dimension1, dimension2);
            case 2:
                return new RightTriangle(color, dimension1, dimension2);
            case 3:
                return new Circle(color, dimension1);
            case 4:
            default:
                return new IsoscelesTrapezoid(color, dimension1, dimension2, dimension3);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
