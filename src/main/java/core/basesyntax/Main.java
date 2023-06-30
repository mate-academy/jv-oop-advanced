package core.basesyntax;

import figure.Figure;
import java.util.Random;
import tools.FigureSupplier;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureCreater = new FigureSupplier();
        int sizeLists = new Random().nextInt(FigureSupplier.MIN_COUNT_FIGURE + 1)
                + (FigureSupplier.MAX_COUNT_FIGURE - FigureSupplier.MIN_COUNT_FIGURE);
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
