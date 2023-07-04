package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.procesdata.FigureSupplier;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
