package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureSupplier;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[FIGURES_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {

            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
