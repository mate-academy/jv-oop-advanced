package core.basesyntax;

import core.basesyntax.figures.Figure;

public class App {
    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        final int figuresArraySize = 6;
        Figure[] figures = new Figure[figuresArraySize];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
            System.out.println();
        }

    }
}
