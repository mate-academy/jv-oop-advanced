package core.basesyntax;

import core.basesyntax.figures.*;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else if (i >= (figures.length / 2)) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
