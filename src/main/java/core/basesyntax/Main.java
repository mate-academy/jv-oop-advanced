package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        FigureSupplier supplier = new FigureSupplier(color, random);

        Figure [] array = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                array[i] = supplier.getRandomFigure();
                continue;
            }
            array[i] = supplier.getDefaultFigure();
        }
        for (Figure figure : array) {
            figure.drawFigure();
        }
    }
}
