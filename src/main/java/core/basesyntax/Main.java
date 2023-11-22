package core.basesyntax;

import core.basesyntax.utils.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int arraySize = 6;

        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
