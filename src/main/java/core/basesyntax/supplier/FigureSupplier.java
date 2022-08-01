package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_MAX_COUNT = 10;
    private static final int FIGURE_MIN_COUNT = 1;
    private final Circle circle = new Circle("Circle","white",FIGURE_MAX_COUNT);

    public int getRandomFigureProperties() {
        return new Random().nextInt(FIGURE_MAX_COUNT) + FIGURE_MIN_COUNT;
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
