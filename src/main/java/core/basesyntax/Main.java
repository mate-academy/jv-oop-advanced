package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.utils.FigureSupplier;
import java.util.Random;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;
    private static final int NUMBER_OF_GENERATED_FIGURES = 3;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random);
        Figure[] figures = new Figure[SIZE_OF_ARRAY];

        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (i < NUMBER_OF_GENERATED_FIGURES) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
