package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureSupplier;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int figures = 6;
        for (int i = 0; i < figures; i++) {
            Figure figure = null;
            if (i < figures / 2) {
                figure = figureSupplier.getRandomFigure();
            } else {
                figure = figureSupplier.getDefaultFigure(figures / 2);
            }
            figure.draw();
        }
    }
}
