package core.basesyntax;

import core.basesyntax.figure.AbstractFigure;
import core.basesyntax.suplier.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        AbstractFigure[] figures = new AbstractFigure[8];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (AbstractFigure figure : figures) {
            figure.draw();
        }
    }
}
