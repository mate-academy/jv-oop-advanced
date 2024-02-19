package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Application {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            figures[i] = i < ARRAY_LENGTH
                    / 2 ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
