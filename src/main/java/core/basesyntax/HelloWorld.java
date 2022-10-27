package core.basesyntax;

import core.basesyntax.service.suppliers.FigureSupplier;
import java.util.Random;

public class HelloWorld {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        figureSupplier.getDefaultFigure().draw();
    }
}





