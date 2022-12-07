package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[random.nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = supplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
