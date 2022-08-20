package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    private static FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            figures[i].draw();
        }
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            figures[i].draw();
        }
    }
}
