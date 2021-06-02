package core.basesyntax;

import java.util.ArrayList;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ArrayList<Shape> listOfShapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Shape newElement = figureSupplier.getRandomFigure();
            listOfShapes.add(newElement);
        }

        for (Shape element: listOfShapes) {
            element.drawFigure();
        }
    }
}
