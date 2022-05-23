package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

public class Main {
    public static final int NUMBER_FIGURES = 10;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[NUMBER_FIGURES];
        for (int i = 0; i < NUMBER_FIGURES; i++) {
            if (figures.length / 2 > i) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure f: figures) {
            f.draw();
        }
    }
}
