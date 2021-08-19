package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;
import java.util.Random;

public class MainAp {
    private static final int NUMBER_OF_FIGURES = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(NUMBER_OF_FIGURES) + 1];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure:figures) {
            figure.draw();
        }
    }
}
