package core.basesyntax;

import core.basesyntax.model.Figure;

public class Main {
    private static final int amountOfCreatedFigures = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[amountOfCreatedFigures];
        for (int i = 0; i < amountOfCreatedFigures; i++) {
            if (i == 1) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
