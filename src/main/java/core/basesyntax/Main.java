package core.basesyntax;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                FIGURE_SUPPLIER.getRandomFigure().draw();
            } else {
                FIGURE_SUPPLIER.getDefaultFigure().draw();
            }
        }
    }
}
