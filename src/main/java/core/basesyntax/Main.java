package core.basesyntax;

import core.basesyntax.service.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[6];
        for (int i = 0; i < (arrayOfFigures.length / 2); i++) {
            arrayOfFigures[i] = figureSupplier.getRandomFigure();
            arrayOfFigures[i].draw();

        }
        for (int j = (arrayOfFigures.length / 2); j < arrayOfFigures.length; j++) {
            arrayOfFigures[j] = figureSupplier.getDefaultFigure();
            arrayOfFigures[j].draw();
        }
    }
}
