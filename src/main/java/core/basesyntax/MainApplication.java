package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class MainApplication {
    private static final int SIZE_ARRAY_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_ARRAY_FIGURES];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        int indexExistFigure = 0;
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figures[indexExistFigure];
            indexExistFigure++;
        }
        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}
