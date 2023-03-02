package core.basesyntax;

import core.basesyntax.model.Figure;

public class FiguresCreating {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i <= figures.length / 2 - 1 ?
                    figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
