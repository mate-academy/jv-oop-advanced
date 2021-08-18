package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i].draw();
        }
    }
}
