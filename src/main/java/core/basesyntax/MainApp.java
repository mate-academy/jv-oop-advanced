package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureSupplier;

public class MainApp {
    public static final int FIGURES = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURES; i++) {
            Figure figure = null;
            if (i < FIGURES / 2) {
                figure = figureSupplier.getRandomFigure();
            } else {
                figure = figureSupplier.getDefaultFigure();
            }
            figure.draw();
        }
    }
}
