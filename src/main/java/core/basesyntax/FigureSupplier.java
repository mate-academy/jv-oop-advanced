package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random rand = new Random();

    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int FIGURE_DEFALT_RADIUS = 10;
    private static final double MAX_SIZE = 24;

    public Figure getFigure() {
        int figureType = rand.nextInt(FIGURE_TYPES_COUNT);
        Color color = colorSupplier.getColor();

        switch (figureType) {
            case 0:
                return new Circle(color, randSize());
            case 1:
                return new Square(color, randSize());
            case 2:
                return new Rectangle(color, randSize(), randSize());
            case 3:
                return new RightTriangle(color, randSize(), randSize());
            case 4:
                return new IsoscelesTrapezoid(color, randSize(), randSize(), randSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, FIGURE_DEFALT_RADIUS);
    }

    private double randSize() {
        return 1 + rand.nextDouble() * MAX_SIZE;
    }
}
