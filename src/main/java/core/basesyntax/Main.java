package core.basesyntax;

import core.basesyntax.enumuration.Figures;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int figuresLength = Figures.values().length;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[figuresLength];

        for (int i = 0; i < figuresLength; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= figuresLength / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
