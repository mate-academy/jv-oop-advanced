package core.basesyntax;

import core.basesyntax.Figure.Circle;
import core.basesyntax.Figure.Figure;
import core.basesyntax.Figure.Square;
import core.basesyntax.Supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[5];

        for (int i = 0; i < figure.length; i++) {
            if (i < 3) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure entity : figure) {
           entity.draw();
        }
    }
}
