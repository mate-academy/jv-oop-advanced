package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int Array_Size = 5;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[Array_Size];
        for (int i = 0; i < figures.length; i++) {
            if (i == 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
    }
}
