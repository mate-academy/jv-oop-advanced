package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suplire.FigureSupplier;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static final int ARRAY_LENGTH = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = ARRAY_LENGTH / 2; i < ARRAY_LENGTH; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.drawFigure();
        }
    }
}
