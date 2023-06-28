package core.basesyntax;

import core.basesyntax.figures.Figure;

public class HelloWorld {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        //fill first half of array
        for (int i = 0; i < FIGURE_COUNT / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        //fill second half of array
        for (int i = FIGURE_COUNT / 2; i < FIGURE_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        //draw each figure
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i].draw();
        }
    }
}
