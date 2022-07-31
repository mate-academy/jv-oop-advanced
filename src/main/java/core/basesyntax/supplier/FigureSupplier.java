package core.basesyntax.supplier;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_MAX_COUNT = 5;
    private static final int FIGURE_MIN_COUNT = 1;

    public int getRandomFigureProperties() {
        return new Random().nextInt(FIGURE_MAX_COUNT) + FIGURE_MIN_COUNT;
    }
}
