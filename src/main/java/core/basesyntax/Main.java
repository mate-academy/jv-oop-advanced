package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = figureSupplier.whichFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for(Figure fig: figures) {
            fig.infoAboutFigure();
        }
    }
}
