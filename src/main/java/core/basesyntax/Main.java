package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static final int FIGURES_TO_CREATE = 11;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_TO_CREATE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_TO_CREATE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < FIGURES_TO_CREATE / 2 + FIGURES_TO_CREATE % 2; i++) {
            figures[FIGURES_TO_CREATE / 2 + i] = figureSupplier.gerDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
