package core.basesyntax;

import core.basesyntax.service.suppliers.FigureSupplier;

public class HelloWorld {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        for (int i = 0; i < (figures.length + 1) / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        figureSupplier.getDefaultFigure().draw();
    }
}
