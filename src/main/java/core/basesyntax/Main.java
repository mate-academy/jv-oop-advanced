package core.basesyntax;

import core.basesyntax.shapes.Shape;
import core.basesyntax.supliers.FigureSupplier;

public class Main {
    public static final int SHAPES_COUNT = 10;

    public static void main(String[] args) {
        drawShapes(generateShapes());
    }

    private static void drawShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private static Shape[] generateShapes() {
        FigureSupplier figureSupplier = new FigureSupplier();
        Shape[] shapes = new Shape[SHAPES_COUNT];
        for (int i = 0; i < shapes.length; i++) {
            if (i < shapes.length / 2) {
                shapes[i] = figureSupplier.getRandomFigure();
            } else {
                shapes[i] = figureSupplier.getDefaultFigure();
            }
        }
        return shapes;
    }
}
