package core.basesyntax;

import core.basesyntax.temp.Figure;
import core.basesyntax.temp.FigureSupplier;

public class Main {
    public static void main(String[] args) {

        Figure [] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (figures.length / 2 > i) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i]);
        }
    }
}
