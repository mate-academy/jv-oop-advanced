package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class MainApplication {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayFigures = new Figure[6];
        for (int i = 0; i < arrayFigures.length / 2; i++) {
            arrayFigures[i] = figureSupplier.getRandomFigure();
            arrayFigures[i].area();
        }
    }
}
