package core.basesyntax;

import core.basesyntax.domain.parent.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[12];
        addRandomFiguresToArray(figures);
        addDefaultFiguresToArray(figures);
        displayFigures(figures);
    }

    private static void addRandomFiguresToArray(Figure[] figures) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
    }

    private static void addDefaultFiguresToArray(Figure[] figures) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
    }

    private static void displayFigures(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
