package core.basesyntax;

import core.basesyntax.figures.Figure;

public class App {
    private static final int COUNTER = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNTER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < COUNTER; i++) {
            if (i < 4) {
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
