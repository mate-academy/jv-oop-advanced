package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class MainApplication {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_NUMBER];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}
