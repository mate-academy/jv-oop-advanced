package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length - 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }


    }
}
