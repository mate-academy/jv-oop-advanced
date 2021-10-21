package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int ARR_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        Figure[] figures = new Figure[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            if (i >= ARR_LENGTH / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].drawInfo();
        }
    }
}
