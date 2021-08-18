package core.basesyntax;

import core.basesyntax.random.FigureSupplier;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        randomFigure.getRandomFigure().toDraw();
    }
}
