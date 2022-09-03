package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final int FIRST_HALF_ARRAY = 3;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
            for (int i = 0; i < FIRST_HALF_ARRAY; i++) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawFigure();
            }
            for (int i = FIRST_HALF_ARRAY; i < figures.length; i++) {
                figures[i] = figureSupplier.getDefaultFigure();
                figureSupplier.drawDefaultFigure();
            }
    }
}
