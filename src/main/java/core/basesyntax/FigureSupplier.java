package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public FigureList getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        FigureList[] values = FigureList.values();
        return values[figureNumber];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
