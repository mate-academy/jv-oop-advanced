package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_FIGURES = 5;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < figures.length; i++) {

        if (i == 2) {
           figureSupplier.getDefaultCircle();
        }
        }
    }

}
