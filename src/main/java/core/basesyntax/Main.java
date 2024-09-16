package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static final int AMOUNT_OF_FIGURES = 10;

    public static void main(String[] args) {
        FigureSupplier figureCreator = new FigureSupplier();
        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];
        for (int i = 0; i < AMOUNT_OF_FIGURES; i++) {
            if (i < AMOUNT_OF_FIGURES / 2) {
                figures[i] = figureCreator.getRandomFigure();
            } else {
                figures[i] = figureCreator.getDefaultFigure();
            }

            figures[i].draw();
        }
    }
}
