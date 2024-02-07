package core.basesyntax;

import core.basesyntax.figures.Figure;

public class HelloWorld {
    private static final int FIGURE_QTE = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_QTE];

        for (int i = 0; i < FIGURE_QTE; i++) {
            if (i < FIGURE_QTE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
