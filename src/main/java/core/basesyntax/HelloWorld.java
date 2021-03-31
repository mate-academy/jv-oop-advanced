package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();
        final int limitCountRandomFigure = 5;
        int countRandomFigure = random.nextInt(limitCountRandomFigure);
        Figures[] figures = new Figures[countRandomFigure];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getFigure();
            figures[i].getDraw();
        }
    }
}
