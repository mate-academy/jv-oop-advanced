package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figuresuppliers.FigureSupplier;

public class Main {
    private static final int SIZE = 4;

    public static void main(String[] args) {
        Figure[] arr = new Figure[SIZE];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = supplier.getRandomFigure();
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = supplier.getDefaultFigure();
        }

        for (Figure figure : arr) {
            figure.printInformation();
        }
    }
}
