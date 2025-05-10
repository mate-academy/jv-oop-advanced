package core.basesyntax;

import core.basesyntax.classes.figures.Figure;
import core.basesyntax.classes.functional.FigureSupplier;

public class Main {
    private static final int SIZE_OF_FIGURES = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[SIZE_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.drawData();
        }
    }
}
