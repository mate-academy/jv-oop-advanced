package core.basesyntax;

import core.basesyntax.model.Figure;

public class Application {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        for (int i = 0; i < figures.length - 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[2] = figureSupplier.getDefaultFigure();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
