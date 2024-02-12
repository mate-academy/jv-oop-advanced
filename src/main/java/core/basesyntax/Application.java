package core.basesyntax;

import core.basesyntax.model.Figure;

public class Application {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figures.length;i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                continue;
            }
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure:figures) {
            figure.draw();
        }

    }
}
