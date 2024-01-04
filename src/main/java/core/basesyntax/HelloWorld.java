package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            if (i == 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure fig : figures) {
            fig.draw();
        }
    }

}
