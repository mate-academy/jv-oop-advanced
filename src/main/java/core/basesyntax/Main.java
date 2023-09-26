package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.randomizer.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int lengthOfArray = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[lengthOfArray];

        for (int i = 0; i < lengthOfArray / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i = lengthOfArray / 2; i < lengthOfArray; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
