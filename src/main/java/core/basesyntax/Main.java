package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int k = figures.length / 2; k < figures.length; k++) {
            figures[k] = figureSupplier.getDefaultFigure();
            figures[k].draw();
        }
        System.out.println(Arrays.toString(figures));
    }
}
