package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supliers.FigureSupplier;
import java.util.Random;

public class Main {
    private static final int LENGTH = 5;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(LENGTH)];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
