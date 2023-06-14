package core.basesyntax;

import core.basesyntax.AbstractClasses.Figure;
import core.basesyntax.FigureSupply.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int j = 0; j < figures.length; j++) {
            if (figures[j] != null) {
                System.out.println("Element " + (j + 1) + ": " + figures[j].drawInfo());
            }
        }
    }
}
