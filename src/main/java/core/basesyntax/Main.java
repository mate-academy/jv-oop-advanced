package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.services.FigureSupplier;
import java.util.Random;

public class Main {
    private static final int MAX_FIGURES_COUNT = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(MAX_FIGURES_COUNT)];
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure figure;
        for (int i = 0; i < figures.length; i++) {
            figure = figureSupplier.getRandomFigure();
            figures[i] = figure;
        }
        for (Figure f : figures) {
            f.getInfo();
        }
    }
}
