package core.basesyntax;

import core.basesyntax.figures.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class MainApp {
    private static final int DEFAULT_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Figure[] figures = new Figure[DEFAULT_ARRAY_SIZE];
        int figuresHalfSize = figures.length / 2;
        for (int i = 0; i < figuresHalfSize; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figuresHalfSize; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
