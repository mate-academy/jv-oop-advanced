package core.basesyntax.main;

import core.basesyntax.state.Figure;
import core.basesyntax.state.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] rndFigureArr = new Figure[(int)((Math.random() * 5) + 1)];

        for (int i = 0; i < rndFigureArr.length; i++) {
            rndFigureArr[i] = FigureSupplier.getRandomFigure();
        }

        for (Figure figure : rndFigureArr) {
            figure.draw();
        }
    }
}
