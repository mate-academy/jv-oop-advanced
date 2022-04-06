package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        figure[0] = FigureSupplier.getRandomFigure();
        figure[1] = FigureSupplier.getRandomFigure();
        figure[2] = FigureSupplier.getRandomFigure();
        figure[3] = FigureSupplier.getDefaultFigure();
        figure[4] = FigureSupplier.getDefaultFigure();
        figure[5] = FigureSupplier.getDefaultFigure();

        for (Figure f : figure) {
            f.draw();
        }
    }
}
