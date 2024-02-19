package core.basesyntax.Main;

import core.basesyntax.Suppliers.FigureSupplier;

public class Main {
    private static final int TEST_ARRAY = 6;
    public static void main(String... args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] figures = new String[TEST_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i]);
        }
    }
}
