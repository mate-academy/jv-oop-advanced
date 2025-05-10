package core.basesyntax;

import core.basesyntax.figures.Shape;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < shapes.length; i++) {
            if (i < 3) {
                shapes[i] = figureSupplier.getRandomFigure();
            } else {
                shapes[i] = figureSupplier.getDefaultFigure();
            }
            shapes[i].draw();
        }
    }
}
