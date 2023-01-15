package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int FIGURE_COUNT = 6;
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2)) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].Draw();
        }
    }
}
