package core.basesyntax;

import java.util.Random;
import java.awt.Color;

class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final double MAX_PARAMETER = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);
        double param1 = random.nextDouble() * MAX_PARAMETER;
        double param2 = random.nextDouble() * MAX_PARAMETER;
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color, param1);
            case 1:
                return new Rectangle(color, param1, param2);
            case 2:
                return new RightTriangle(color, param1, param2);
            case 3:
                return new Circle(color, param1);
            case 4:
                return new IsoscelesTrapezoid(color, param1, param2, param1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
