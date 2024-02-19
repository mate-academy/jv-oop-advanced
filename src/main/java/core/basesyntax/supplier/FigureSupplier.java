package core.basesyntax.supplier;

import core.basesyntax.colors.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int FIGURE_NUMBER = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double MIN_RAND = 10.0;
    private static final double MAX_RAND = 50.0;

    public Figure getRandomFigure() {
        int randIndex = RANDOM.nextInt(FIGURE_NUMBER);
        Figure figure;

        switch (randIndex) {
            case 0 -> figure = new Circle(getRandomDouble(), COLOR_SUPPLIER.getRandomColor());
            case 1 -> figure = new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), COLOR_SUPPLIER.getRandomColor());
            case 2 -> figure = new Rectangle(getRandomDouble(), getRandomDouble(),
                    COLOR_SUPPLIER.getRandomColor());
            case 3 -> figure = new RightTriangle(getRandomDouble(),
                    COLOR_SUPPLIER.getRandomColor());
            case 4 -> figure = new Square(getRandomDouble(), COLOR_SUPPLIER.getRandomColor());
            default -> throw new IllegalArgumentException("Unexpected value for CASE_INDEX: "
                    + randIndex);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomDouble() {
        return RANDOM.nextDouble(MIN_RAND, MAX_RAND);
    }
}
