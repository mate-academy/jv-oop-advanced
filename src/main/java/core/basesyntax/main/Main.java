package core.basesyntax.main;

import core.basesyntax.state.Figure;
import core.basesyntax.state.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] randomFigureArray = new Figure[(int)((Math.random() * 5) + 1)];

        for (int i = 0; i < randomFigureArray.length; i++) {
            randomFigureArray[i] = FigureSupplier.getRandomFigure();
        }

        for (Figure figure : randomFigureArray) {
            figure.draw();
        }
    }
}
