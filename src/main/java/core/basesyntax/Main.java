package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.randomizer.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int Array_Length = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[Array_Length];

        for (int i = 0; i < Array_Length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i = Array_Length / 2; i < Array_Length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
