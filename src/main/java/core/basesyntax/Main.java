package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i <= figure.length / 2 - 1) {
                figure[i] = new FigureSupplier().getRandomFigure();
            } else {
                figure[i] = new FigureSupplier().getDefaultFigure();
            }
            figure[i].draw();
        }
    }
}
