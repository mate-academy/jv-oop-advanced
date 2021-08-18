package core.basesyntax;

import core.basesyntax.figure.core.Figure;
import core.basesyntax.utilities.FigureSupplier;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] arrOfFigures = new Figure[new Random().nextInt(20)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arrOfFigures.length; i++) {
            arrOfFigures[i] = figureSupplier.getRandomFigure();
            arrOfFigures[i].drawFigure();
        }
    }
}
