package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(
                new ColorSupplier(new Random()), new Random());

        Figure[] figures = new Figure[FIGURES_AMOUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                figures[i] = randomFigure;
                figures[i].draw();
            }
            Figure defaultFigure = figureSupplier.getDefaultFigure();
            figures[i] = defaultFigure;
            figures[i].draw();
        }
    }
}
