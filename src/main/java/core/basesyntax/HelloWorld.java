package core.basesyntax;

import core.basesyntax.service.suppliers.FigureSupplier;

import java.util.Random;



/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(6)];
        for (int i=0; i < (figures.length + 1) / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i=(figures.length + 1) / 2, j = 0; i < figures.length; i++) {
            figures[j++] = figures[i];
            figures[j++] = figureSupplier.getDefaultFigure().draw();
        }
    }
}





