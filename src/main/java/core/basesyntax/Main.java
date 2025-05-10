package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random t = new Random();

        Figure[] figures = new Figure[t.nextInt(20)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
