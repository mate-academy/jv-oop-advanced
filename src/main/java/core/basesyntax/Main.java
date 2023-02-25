package core.basesyntax;

import core.basesyntax.entities.Figure;
import core.basesyntax.utils.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
