package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.procesdata.FigureSupplier;

public class Main {
    FigureSupplier figureSupplier = new FigureSupplier();
    
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
