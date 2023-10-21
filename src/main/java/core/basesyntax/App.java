package core.basesyntax;

import core.basesyntax.figures.Figure;

public class App {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[6];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < 3) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(arrayOfFigures[i]);
        }
    }
}
