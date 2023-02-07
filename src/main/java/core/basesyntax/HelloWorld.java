package core.basesyntax;

import java.util.Random;

public class HelloWorld {
    public static final Random RANDOM = new Random();
    public static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    public static final int MAX_FIGURE_COUNT = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_FIGURE_COUNT];
        for (int i = 0; i < MAX_FIGURE_COUNT; i++) {
            if (i < MAX_FIGURE_COUNT / 2) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
                figures[i].toDraw();
            } else {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
                figures[i].toDraw();
            }
        }
    }
}
