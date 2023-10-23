package core.basesyntax;

import core.basesyntax.figures.Figure;

public class App {
    private static final int LENGTH_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[LENGTH_OF_ARRAY];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < arrayOfFigures.length / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
            arrayOfFigures[i].draw();
        }
    }
}
