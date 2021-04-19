package core.basesyntax;

import core.basesyntax.utils.factory.FigureSupplier;

public class App {
    public static void main(String[] args) {
        Figure[] figures = new FigureSupplier().generateRandomFigures();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
