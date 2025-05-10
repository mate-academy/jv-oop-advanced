package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color, random.nextDouble() * 10);
            case 1:
                return new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3:
                return new Circle(color, random.nextDouble() * 10);
            case 4:

            default:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10, random.nextDouble()
                        * 10, random.nextDouble() * 10);
        }
    }

    public Figure getDefaultFigure() {

        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
