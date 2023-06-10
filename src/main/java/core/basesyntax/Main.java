package core.basesyntax;

import core.basesyntax.shape.Shape;
import core.basesyntax.supplier.ShapeSupplier;

public class Main {
    public static void main(String[] args) {
        ShapeSupplier shapeSupplier = new ShapeSupplier();

        Shape[] shapes = new Shape[] {
                shapeSupplier.getRandom(),
                shapeSupplier.getRandom(),
                shapeSupplier.getRandom(),
                shapeSupplier.getDefault(),
                shapeSupplier.getDefault(),
                shapeSupplier.getDefault()
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
