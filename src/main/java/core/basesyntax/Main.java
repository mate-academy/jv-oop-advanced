package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_VALUE_FIGURES = 6;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figures = new Figure[MAX_VALUE_FIGURES];

        for (int i = 0; i < MAX_VALUE_FIGURES; i++) {
            if (i < MAX_VALUE_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
