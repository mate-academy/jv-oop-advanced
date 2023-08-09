package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    static final int SIZE = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE];
        for (int i = 0; i < SIZE; i++) {
            figures[i] = i >= SIZE / 2
                    ? figureSupplier.getDefaultFigure() : figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());;
        }
    }
}
