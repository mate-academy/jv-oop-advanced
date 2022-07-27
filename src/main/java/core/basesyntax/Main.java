package core.basesyntax;

import core.basesyntax.models.Figure;
import core.basesyntax.services.FigureSupplier;

public class Main {
    private static final int COUNT_FIGURES = 15;

    public static void main(String[] arg) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_FIGURES];
        for (int i = 0; i < COUNT_FIGURES; i++) {
            if (i % 2 == 1) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.printInfo());
        }
    }
}
