package core.basesyntax;

import randomizers.FigureSupplier;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i >= NUMBER_OF_FIGURES / 2) {
                System.out.println(figureSupplier.getDefaultFigure().drawFigure());
                continue;
            }
            System.out.println(figureSupplier.getRandomFigure().drawFigure());
        }
    }

}
