package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int LOOP_COUNTER = 6;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        FigureSupplier supplier = new FigureSupplier(color, random);

        Figure [] array = new Figure[LOOP_COUNTER];
        for (int i = 0; i < LOOP_COUNTER; i++) {
            if (i < LOOP_COUNTER / 2) {
                array[i] = supplier.getRandomFigure();
                continue;
            }
            array[i] = supplier.getDefaultFigure();
        }
        for (Figure figure : array) {
            figure.draw();
        }
    }
}
