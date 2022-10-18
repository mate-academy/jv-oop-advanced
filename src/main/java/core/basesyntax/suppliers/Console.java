package core.basesyntax.suppliers;

import core.basesyntax.figures.Figure;

public class Console {
    public static void main(String[] args) {

        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure f : figure) {
            System.out.println(f);
        }
    }
}
