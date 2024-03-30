package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.service.FigureSupplier;

public class Application {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[6];

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figureSupplier.getRandomFigure();
                array[i].draw();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
                array[i].draw();
            }
        }
    }
}
