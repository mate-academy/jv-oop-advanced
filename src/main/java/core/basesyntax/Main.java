package core.basesyntax;

import core.basesyntax.temp.Figure;
import core.basesyntax.temp.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (figures.length / 2 > i)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
