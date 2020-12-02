package core.basesyntax;

import core.basesyntax.figures.Shape;

public class Main {

    public static void main(String[] args) {

        Shape[] figures = FigureOps.generateFigures(10);

        FigureOps.drawFigure(figures);
    }

}
