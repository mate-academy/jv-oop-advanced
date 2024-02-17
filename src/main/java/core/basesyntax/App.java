package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.utils.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = {figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure()};

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
