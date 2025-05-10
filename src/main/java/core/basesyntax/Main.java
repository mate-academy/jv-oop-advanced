package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int FIGURES_BOUND = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_BOUND];
        FigureSupplier figureSupplier = new FigureSupplier(new Random(), new ColorSupplier());
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2)
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            System.out.println(figures[i].drawFigure());
        }
    }
}
