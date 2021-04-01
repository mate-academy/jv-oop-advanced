package core.basesyntax;

import core.basesyntax.generator.FigureSupplier;
import java.util.Random;

public class Main {
    private static final int FIGURE_COUNT = 50;

    public static void main(String[] args) {
        Random random = new Random();

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = figureSupplier.generateFigures(FIGURE_COUNT);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
