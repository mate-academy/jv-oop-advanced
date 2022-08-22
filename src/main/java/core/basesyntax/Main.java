package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supliers.FigureSupplier;
import java.util.Random;

public class Main {

    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(5)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
