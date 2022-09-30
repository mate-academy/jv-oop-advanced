package core.basesyntax;

import core.basesyntax.models.Figure;
import core.basesyntax.models.FigureSupplier;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_AMOUNT];
        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure()
                         : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
