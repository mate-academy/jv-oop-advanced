package core.basesyntax;

import core.basesyntax.shapes.Drawable;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    private static final int SHAPES_LIMIT = 10;

    public static void main(String[] args) {
        Drawable[] shapeArray = new Drawable[(int) (Math.random() * SHAPES_LIMIT) + 1]; // minimum size of array = 1
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i] = (Drawable) figureSupplier.generateShape();
        }

        for (Drawable shape : shapeArray) {
            shape.draw();
        }
    }
}
