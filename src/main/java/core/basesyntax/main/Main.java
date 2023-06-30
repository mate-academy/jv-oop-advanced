package core.basesyntax.main;

import core.basesyntax.figures.Figure;
import core.basesyntax.processes.FigureSupplier;

public class Main {
    public static final int FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES; i++) {
            if (i < FIGURES / 2) {
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
