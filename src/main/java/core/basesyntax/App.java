package core.basesyntax;

import core.basesyntax.figures.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int figuresArraySize = 6;
        Figure[] figures = new Figure[figuresArraySize];
        for (int i = 0; i < figures.length/2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
            System.out.println();
        }
        for (int i = figures.length/2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            System.out.println();
        }
    }
}
