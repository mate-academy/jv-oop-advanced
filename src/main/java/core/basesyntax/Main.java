package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 5; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
