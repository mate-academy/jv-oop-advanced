package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < 3; i++) {
            figures[i].draw();
        }
        for (int b = 3; b < 6; b++) {
            figures[b] = figureSupplier.getDefaultFigure();
        }
        for (int b = 3; b < 6; b++) {
            figures[b].draw();
        }
    }
}
