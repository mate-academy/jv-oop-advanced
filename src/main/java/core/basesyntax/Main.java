package core.basesyntax;

import core.basesyntax.behaviour.FigureCreator;
import core.basesyntax.figure.Figure;
import core.basesyntax.tools.FigureSupplier;

public class Main {
    private static FigureCreator figureCreater = new FigureSupplier();

    public static void main(String[] args) {
        final int arraySize = 6;
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            if (i < arraySize / 2) {
                figures[i] = figureCreater.getRandomFigure();
            } else {
                figures[i] = figureCreater.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
