package core.basesyntax.model;

import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    private static FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
