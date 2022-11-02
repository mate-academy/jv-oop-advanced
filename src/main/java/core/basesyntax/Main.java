package core.basesyntax;

import core.basesyntax.service.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static Figure[] figures = new Figure[6];

    public static void main(String[] args) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = new FigureSupplier().getRandom();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}

