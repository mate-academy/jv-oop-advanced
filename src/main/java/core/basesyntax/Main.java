package core.basesyntax;

import java.util.Random;

public class Main {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
