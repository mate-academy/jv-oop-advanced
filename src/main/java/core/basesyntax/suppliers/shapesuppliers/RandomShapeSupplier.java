package core.basesyntax.suppliers.shapesuppliers;

import core.basesyntax.enums.Shape;
import java.util.Random;

public class RandomShapeSupplier {
    private final Shape[] shapes = Shape.values();
    private final Random random = new Random();

    public Shape getRandomShape() {
        return shapes[getRandomIndex()];
    }

    private int getRandomIndex() {
        return random.nextInt(shapes.length);
    }
}
