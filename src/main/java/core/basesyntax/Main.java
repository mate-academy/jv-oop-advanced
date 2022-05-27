package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int FINAL_INDEX = 6;
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[FINAL_INDEX];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
