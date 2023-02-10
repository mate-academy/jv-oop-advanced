package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.randomizers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figure.getRandomFigure();
                System.out.println(figures[i].drawFigure());
            } else {
                figures[i] = figure.getDefaultFigure();
                System.out.println(figures[i].drawFigure());
            }
        }
    }
}
