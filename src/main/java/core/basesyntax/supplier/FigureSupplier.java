package core.basesyntax.supplier;

import core.basesyntax.model.abstraction.Figure;

public class FigureSupplier {
    private Figure figure;

    public Figure getRandomFigure() {
        return figure;
    }

    public Figure getDefaultFigure() {
        System.out.println("this method should always return white circle with radius 10.");
        return figure;
    }
}
