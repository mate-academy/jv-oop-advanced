package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ?
                    figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }

}
