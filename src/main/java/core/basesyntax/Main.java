package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.utils.FigureSupplier;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        int defaultFigureThreshold = 3;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < defaultFigureThreshold) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }

}
