package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int FIGURES_LENGTH = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGTH * 2];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i + figures.length / 2] = new FigureSupplier().getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].getDraw();
        }
    }
}
