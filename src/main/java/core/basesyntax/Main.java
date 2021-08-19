package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAX_FIGURES_COUNT = 10;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(MAX_FIGURES_COUNT)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
            System.out.println();
        }
    }
}
