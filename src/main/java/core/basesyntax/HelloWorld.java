package core.basesyntax;

import core.basesyntax.util.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 1; i <= 6; i++) {
            if (i < 4) {
                figureSupplier.getRandomFigure((int)(Math.random() * 5) + 1).draw();

            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }

}
