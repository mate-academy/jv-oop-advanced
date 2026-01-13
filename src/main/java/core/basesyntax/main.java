package core.basesyntax;

import core.basesyntax.Figures.Figure;
import core.basesyntax.Suppliers.FigureSupplier;

public class main {
    public static void main(String[] args) {
        int indexOfRandomFigures = 5;
        Figure[] figures = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length;i++) {
            if (i < indexOfRandomFigures) {
               figures[i] = figureSupplier.getRandomFigure();
               System.out.println(figures[i].drawing());
            }
            else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].drawing());
            }
        }
    }
}
