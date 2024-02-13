package core.basesyntax;

import core.basesyntax.helpers.FigureSupplier;
import core.basesyntax.models.Figure;

public class Main {
    private static final int FIGURES_NUMBER_FOR_RENDER = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_NUMBER_FOR_RENDER];
        int middleIndex = FIGURES_NUMBER_FOR_RENDER / 2;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < middleIndex) {
                figures[i] = figureSupplier.getRandomFigure();;
            } else {
                figures[i] = figureSupplier.getDefaultFigure();;
            }
            figures[i].draw();
        }
    }
}
