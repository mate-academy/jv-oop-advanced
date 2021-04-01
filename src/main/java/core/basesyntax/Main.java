package core.basesyntax;

import core.basesyntax.shapes.Shape;

import java.util.Random;

public class Main {

    private static final int SHAPES_LIMIT = 9;

    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapeArray = new Shape[1 + random.nextInt(SHAPES_LIMIT)];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i] = figureSupplier.generateShape();
        }

        for (Shape shape : shapeArray) {
            shape.draw();
        }
    }
}
