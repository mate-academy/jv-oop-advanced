package core.basesyntax;

import java.util.Arrays;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] arrayOfFigure = new Figure[FIGURE_ARRAY_SIZE];
        for (int i = 0; i < arrayOfFigure.length; i++) {
            arrayOfFigure[i] = i < arrayOfFigure.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
    }
}
