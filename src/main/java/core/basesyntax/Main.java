package core.basesyntax;

import core.basesyntax.utils.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int arraySize = 6;

        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < arraySize; i++) {
            figures[i] = i < arraySize / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
