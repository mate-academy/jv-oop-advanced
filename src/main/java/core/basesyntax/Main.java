package core.basesyntax;

import model.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        firstHalf();
        System.out.println("-------------------------------------");
        secondHalf();
    }

    private static void firstHalf() {
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < 5; i++) {
            figure.getRandomFigure().draw();
        }
    }

    private static void secondHalf() {
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            figure.getDefaultFigure().draw();
        }
    }
}
