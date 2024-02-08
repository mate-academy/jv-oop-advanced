package core.basesyntax;

import core.basesyntax.figures.Figure;

public class HelloWorld {
    private static final int FIGURE_COUNT = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
