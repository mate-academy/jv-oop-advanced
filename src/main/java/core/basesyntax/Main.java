package core.basesyntax;

import core.basesyntax.figures.Shape;
import core.basesyntax.suppliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < shapes.length; i++) {
            while (i < 3) {
                shapes[i++] = figureSupplier.getRandomFigure();
            }
            shapes[i] = figureSupplier.getDefaultFigure();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
