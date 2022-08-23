package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    static final int MAX_FIGURE_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_FIGURE_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? figureSupplier.getRandomFigure()
                : figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
