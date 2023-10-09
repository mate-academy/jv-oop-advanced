package core.basesyntax;

import static core.basesyntax.FigureSupplier.COUNT_FIGURE;
import static core.basesyntax.FigureSupplier.arrayFigures;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < COUNT_FIGURE; i++) {
            if (i < (arrayFigures.length / 2)) {
                arrayFigures[i] = figureSupplier.getRandomFigure();
                arrayFigures[i].draw();
            } else {
                arrayFigures[i] = figureSupplier.getDefoultFigure();
                arrayFigures[i].draw();
            }
        }
    }
}
