package core.basesyntax;

import static core.basesyntax.FigureSupplier.MAX_FIGURES_NUMBER;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[random.nextInt(MAX_FIGURES_NUMBER) + 1];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
