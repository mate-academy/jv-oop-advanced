package core.basesyntax;

import core.basesyntax.dataprocessor.FigureSupplier;
import core.basesyntax.figures.Figure;

public class Main {
    public static final int FIGURES_SIZE = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[FIGURES_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
