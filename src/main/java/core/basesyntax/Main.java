package core.basesyntax;

import core.basesyntax.model.Figure;

public class Main {
    private static final FigureSupplier figSupplier = new FigureSupplier();
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[ARRAY_SIZE];

        for (int i = 0; i < figureArray.length; i++) {
            if (i < (figureArray.length) / 2) {
                figureArray[i] = figSupplier.getRandomFigure();
            } else {
                figureArray[i] = figSupplier.getDefaultFigure();
            }
            figureArray[i].draw();
        }
    }
}
