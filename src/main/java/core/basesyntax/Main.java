package core.basesyntax;

import core.basesyntax.shapes.Shape;

public class Main {

    private static final int SHAPES_LIMIT = 10;

    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[(int) (Math.random() * SHAPES_LIMIT) + 1];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i] = figureSupplier.generateShape();
        }

        for (Shape shape : shapeArray) {
            shape.draw();
        }
    }
}
