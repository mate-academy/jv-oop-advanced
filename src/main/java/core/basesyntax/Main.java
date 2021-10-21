package core.basesyntax;

import core.basesyntax.models.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH >> 1) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
