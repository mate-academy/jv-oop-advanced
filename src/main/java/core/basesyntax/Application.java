package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[FIGURE_AMOUNT];

        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                System.out.println(figureSupplier.getRandomFigure().drawFigure());
            } else {
                System.out.println(figureSupplier.getDefaultFigure().drawFigure());
            }
        }
    }
}
