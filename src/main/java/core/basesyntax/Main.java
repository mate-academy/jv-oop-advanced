package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new Random(),
                new ColorSupplier());
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            System.out.println(figures[i].draw());
        }
    }
}
