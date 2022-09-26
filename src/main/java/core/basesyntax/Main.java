package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

public class Main {
    private static final int MAX_VALUE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_VALUE];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
