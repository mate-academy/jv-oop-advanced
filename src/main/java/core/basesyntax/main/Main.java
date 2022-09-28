package core.basesyntax.main;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static final int SIZE = 6;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figure = new Figure[SIZE];
        for (int i = 0; i < SIZE; i++) {
            figure[i] = i < 3 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figure[i].draw();
        }
    }
}
