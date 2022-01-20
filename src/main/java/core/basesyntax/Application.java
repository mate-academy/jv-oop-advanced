package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Application {
    private static final int COUNT_OF_ALL_FIGURES = 6;
    private static final int COUNT_OF_RANDOM_FIGURES = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT_OF_ALL_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < COUNT_OF_RANDOM_FIGURES
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
