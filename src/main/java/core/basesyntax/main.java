package core.basesyntax;

import core.basesyntax.Figures.Figure;
import core.basesyntax.Supppliers.FigureSupplier;

public class main {
    public static void main(String[] args) {
        int indexOfRandomFigures = 5;
        Figure[] figures = new Figure[10];

        for (int i = 0; i < figures.length;i++) {
            if (i < indexOfRandomFigures) {
               figures[i] = new FigureSupplier().getRandomFigure();
               System.out.println(figures[i].drawing());
            }
            else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }
    }
}
