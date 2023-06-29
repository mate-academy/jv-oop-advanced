package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSuppliers;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        FigureSuppliers figureSuppliers = new FigureSuppliers();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSuppliers.getRandomFigure();
            } else {
                figures[i] = figureSuppliers.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            System.out.println(figure.draw());
        }
    }
}