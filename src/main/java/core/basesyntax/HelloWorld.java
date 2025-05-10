package core.basesyntax;

import core.basesyntax.model.Figure;
import java.util.Random;

public class HelloWorld {
    private static final int PRINTED_FIGURES_COUNT = 10;
    private static final Random random = new Random();

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new Random(), new ColorSupplier());
        for (int i = 0; i < PRINTED_FIGURES_COUNT; i++) {
            Figure figure = i < PRINTED_FIGURES_COUNT / 2
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            System.out.println(figure.toString());
        }
    }
}
