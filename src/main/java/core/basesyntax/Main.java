package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int RANDOM_INT = new Random().nextInt(10);
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure [] figures = new Figure[RANDOM_INT];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].toString());
        }
    }
}
