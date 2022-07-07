package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(6)];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
