package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 6;
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figure = new Figure[size];
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = supplier.getRandomFigure();
            figure[i] = getDraw();
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = supplier.getRandomFigure();
            figure[i] = getDraw();
        }
    }
}
