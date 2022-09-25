package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new FigureSupplier().getRandomFigure();
        figure1.draw();
        Figure figure2 = new FigureSupplier().getRandomFigure();
        figure2.draw();
        Figure figure3 = new FigureSupplier().getDefaultFigure();
        figure3.draw();
    }
}

