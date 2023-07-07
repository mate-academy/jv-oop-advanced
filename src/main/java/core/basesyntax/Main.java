package core.basesyntax;

import core.basesyntax.behaviour.FigureCreator;
import core.basesyntax.figure.Figure;
import core.basesyntax.tools.FigureSupplier;

public class Main {
    private static FigureCreator figureCreater = new FigureSupplier();

    public static void main(String[] args) {
        final int sizeLists = 6;
        Figure[] figureLists = new Figure[sizeLists];
        for (int i = 0; i < sizeLists; ++i) {
            if (i < sizeLists / 2) {
                figureLists[i] = figureCreater.getRandomFigure();
            } else {
                figureLists[i] = figureCreater.getDefaultFigure();
            }
            figureLists[i].draw();
        }
    }
}
