package core.basesyntax;

import core.basesyntax.figure.Figure;

public class Main {
    private static final int RANDOM_FIGURES_COUNT = 3;
    private static final int DEFAULT_FIGURES_COUNT = 3;
    private static final int ARRAY_LENGTH = RANDOM_FIGURES_COUNT + DEFAULT_FIGURES_COUNT;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < RANDOM_FIGURES_COUNT
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            System.out.println(figures[i].draw());
        }
    }
}
