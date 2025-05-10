package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figuresuppliers.FigureSupplier;

public class Main {
    private static final int SIZE = 4;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.printInformation();
        }
    }
}
