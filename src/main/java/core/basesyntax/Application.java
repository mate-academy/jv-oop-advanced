package core.basesyntax;

import core.basesyntax.figure.Figure;

public class Application {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[4];
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getDefaultFigure();
        figures[3] = figureSupplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.getPrint();
        }

    }
}
