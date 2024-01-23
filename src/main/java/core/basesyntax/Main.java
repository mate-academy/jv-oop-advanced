package core.basesyntax;

import core.basesyntax.model.Figure;

public class Main {
    public static final int FIGURE_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
