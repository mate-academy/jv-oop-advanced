package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] value = Figure.values();
        int figure = random.nextInt(FIGURE_COUNT);
        return value[figure];
    }

    public Figure getDefaultFigure() {
        return Figure.CIRCLE;

    }
}
