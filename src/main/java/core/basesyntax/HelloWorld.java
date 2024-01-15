package core.basesyntax;

import java.util.ArrayList;

public class HelloWorld {
    private static final int LIST_VALUES_NUMBER = 20;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ArrayList<Shape> listOfShapes = new ArrayList<>();

        for (int i = 0; i < LIST_VALUES_NUMBER; i++) {
            Shape newElement = figureSupplier.getRandomFigure();
            listOfShapes.add(newElement);
        }

        for (Shape element : listOfShapes) {
            element.draw();
        }
    }
}
