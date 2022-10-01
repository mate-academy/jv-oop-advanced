package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int COUNT_FIGURE = 5;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(random, supplier);
        Figure[] figure = new Figure[6];

        for (int i = 0; i < figure.length; i++) {
            if (i < 3) {
                figureSupplier.getRandomFigure(random.nextInt(COUNT_FIGURE));
            } else {
                figureSupplier.getDefaultFigure();
            }
        }
    }
}
