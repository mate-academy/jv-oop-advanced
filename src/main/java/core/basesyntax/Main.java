package core.basesyntax;

import core.basesyntax.shape.Shape;
import core.basesyntax.supplier.ShapeSupplier;

public class Main {
    private static final byte SHAPES_COUNT = 10;

    public static void main(String[] args) {
        ShapeSupplier shapeSupplier = new ShapeSupplier();

        Shape[] shapes = new Shape[SHAPES_COUNT];

        for (byte i = 0; i < SHAPES_COUNT / 2; i++) {
            shapes[i] = shapeSupplier.getRandom();
        }

        for (byte i = SHAPES_COUNT / 2; i < SHAPES_COUNT; i++) {
            shapes[i] = shapeSupplier.getDefault();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
