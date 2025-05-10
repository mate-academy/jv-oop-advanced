package core.basesyntax;

import core.basesyntax.shapes.Shape;
import java.util.Random;

public class Main {
    private static final int MINIMAL_SIZE_OF_SHAPES_ARRAY = 1;
    private static final int SHAPES_LIMIT = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapeArray = new Shape[MINIMAL_SIZE_OF_SHAPES_ARRAY
                + random.nextInt(SHAPES_LIMIT - MINIMAL_SIZE_OF_SHAPES_ARRAY)];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i] = figureSupplier.generateShape();
        }

        for (Shape shape : shapeArray) {
            shape.draw();
        }
    }
}
