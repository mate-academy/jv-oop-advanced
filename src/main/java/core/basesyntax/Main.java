package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier, random);

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            Figure figure = i < NUMBER_OF_FIGURES / 2
                            ? figureSupplier.getRandomFigure()
                            : figureSupplier.getDefaultFigure();
            figure.draw();
        }
    }
}
