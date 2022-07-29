package core.basesyntax;

import core.basesyntax.temp.Figure;
import core.basesyntax.temp.FigureSupplier;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figure = new Figure[6];

        for (int i = 0; i < figure.length; i++) {
            figure[i] = (figure.length / 2 > i)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figure[i].draw();

        }
    }
}
