package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[FigureSupplier.FIGURE_COUNT];
        FigureSupplier fs = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = fs.getRandomFigure();
            figures[i].draw();
        }
    }
}
