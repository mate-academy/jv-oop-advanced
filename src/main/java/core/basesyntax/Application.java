package core.basesyntax;

import base.Figure;
import service.FigureSupplier;

public class Application {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        // Fill array
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        // Draw array
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
