package core.basesyntax;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();


    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figureSupplier.getRandomFigure();
            } else {
                figureSupplier.getDefaultFigure();
            }
        }
    }
}