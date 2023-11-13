package core.basesyntax;

import static core.basesyntax.FigureSupplier.getRandomFigure;

public class Main {
    static final int FIGURE_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figure = new Figure[FIGURE_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = getRandomFigure();
            if (i >= FIGURE_LENGTH / 2) {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < figure.length; i++) {
            figure[i].describe();
        }
    }
}
