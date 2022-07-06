package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[10];
        for (int i = 0, j = figures.length / 2;
                i < (figures.length) / 2 && j < figures.length; i++, j++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[j] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
