package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_ARRAY_LENGTH];
        for (int i = 0; i < MAX_ARRAY_LENGTH; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
