package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.suppliers.FigureSupplier;


public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++ ) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 3; i < figures.length; i++ ) {
            figures[i] = figureSupplier.getWhiteCircle();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
