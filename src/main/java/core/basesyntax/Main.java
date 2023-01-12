package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.draw();
        }
    }
}
