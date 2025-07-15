package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;
import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        String[] figures = new String[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure().draw();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure().draw();
        }

        System.out.println(Arrays.toString(figures));
    }
}
