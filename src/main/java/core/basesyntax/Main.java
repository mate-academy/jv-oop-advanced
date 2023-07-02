package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSuppliers;

public class Main {
    private static final int SIZE_OF_FIGURE_ARRAY = 4;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_FIGURE_ARRAY];
        FigureSuppliers figureSuppliers = new FigureSuppliers();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSuppliers.getRandomFigure();
            } else {
                figures[i] = figureSuppliers.getDefaultFigure();
            }
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
