package core.basesyntax;

import java.util.Random;

public class Main {
    public static final Random RANDOM = new Random();
    private static final int FIGURE_COUNT = 6;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
                continue;
            }
            figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
        }
        printFigures(figures);
    }

    private static void printFigures(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
