package core.basesyntax;

import java.util.Random;

public class Start {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[random.nextInt(8) + 1];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        System.out.println(figures.length);

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
