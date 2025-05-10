package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.utils.FigureSupplier;

public class HelloWorld {
    public static final int SIZE_ARRAY = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_ARRAY];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
