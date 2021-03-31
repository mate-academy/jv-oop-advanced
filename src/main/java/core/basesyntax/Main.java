package core.basesyntax;

import core.basesyntax.behavior.Shape;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = getShapes();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static Shape[] getShapes() {
        Shape[] shapes = new Shape[new Random().nextInt(10)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = figureSupplier.getFigure();
        }
        return shapes;
    }
}
