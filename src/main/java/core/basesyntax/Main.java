package core.basesyntax;

import core.basesyntax.model.Figure;

public class Main {
    private static final int amountOfCreatedFigures = 4;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[amountOfCreatedFigures];
        for (int i = 0; i < amountOfCreatedFigures; i++) {
            if (i < amountOfCreatedFigures / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
