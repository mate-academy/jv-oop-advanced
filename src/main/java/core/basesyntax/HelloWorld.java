package core.basesyntax;

import core.basesyntax.figures.Figure;

public class HelloWorld {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
