package core.basesyntax;

import java.util.Random;

public class Main {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    private static final int NUMBER_FOR_RANDOM = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[randomInt()];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].toString());
        }
    }

    private static int randomInt() {
        return new Random().nextInt(NUMBER_FOR_RANDOM);
    }
}
