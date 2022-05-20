package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0;i < figures.length;i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0;i < figures.length;i++) {
            figures[i].draw();
        }

    }

}
