package core.basesyntax.model;

import java.util.Random;

public class Main {
    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i > 2) {
                figureSupplier.getDefaultFigure().draw();
            } else {
                figureSupplier
                        .getRandomFigure().draw();
            }
        }
    }
}
