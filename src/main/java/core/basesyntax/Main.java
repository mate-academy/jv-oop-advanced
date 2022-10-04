package core.basesyntax;

import core.basesyntax.figuresupplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[FigureSupplier.FIGURE_NUMBER];

        for (int i = 0; i < FigureSupplier.FIGURE_NUMBER; i++) {
            if (i < FigureSupplier.FIGURE_NUMBER / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
