package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    private static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        int numberOfRandomFigures = NUMBER_OF_FIGURES / 2;

        for (int i = 0; i < numberOfRandomFigures; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = numberOfRandomFigures; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
