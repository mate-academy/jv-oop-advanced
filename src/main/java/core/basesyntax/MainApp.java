package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class MainApp {
    private static final int FULL_CAPACITY = 6;
    private static final int HALF_CAPACITY = 3;
    private static final FigureSupplier supplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FULL_CAPACITY];
        for (int i = 0; i < FULL_CAPACITY; i++) {
            if (i < HALF_CAPACITY) {
                figures[i] = supplier.getRandomFigure();
                continue;
            }
            figures[i] = supplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
