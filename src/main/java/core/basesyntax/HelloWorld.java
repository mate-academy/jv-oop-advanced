package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i > 2
                    ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
