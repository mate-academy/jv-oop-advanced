package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] figures = new String[6];
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure().toString();
        }
        for (int e = 0; e < figures.length / 2; e++) {
            figures[e] = figureSupplier.getRandomFigure().toString();
        }
        System.out.println(Arrays.toString(figures));
    }
}
