package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_MODELS = 5;
    private static final int MAX_DIMENSION = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int getRandomSide() {
        return random.nextInt(MAX_DIMENSION) + 1;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int dimension1 = getRandomSide();
        int dimension2 = getRandomSide();
        int dimension3 = getRandomSide();

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
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
