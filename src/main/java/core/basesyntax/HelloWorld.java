
package core.basesyntax;

import core.basesyntax.figure.type.Figures;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class HelloWorld {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figures[] figures = new Figures[new Random().nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figures figure : figures) {
            figure.print();
        }
    }
}
