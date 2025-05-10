package core.basesyntax;

import core.basesyntax.figures.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                new FigureSupplier().getRandomFigure().draw();

            } else {
                new FigureSupplier().getDefaultFigure().draw();
            }
        }
    }
}
