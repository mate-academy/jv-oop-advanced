package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier(new Random(),
            new ColorSupplier());

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
