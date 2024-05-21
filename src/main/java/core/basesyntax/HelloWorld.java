package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.util.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = figureSupplier.getRandomFigure();

            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure current : figures) {
            current.draw();
        }
    }
}
