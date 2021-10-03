package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       final int MAXIMUM_NUMBER_OF_ELEMENTS_IN_ARRAY = 10;
       int numberOfElements = new Random().nextInt(MAXIMUM_NUMBER_OF_ELEMENTS_IN_ARRAY) + 1;
       Figure[] randomFigure = new Figure[numberOfElements];
       FigureSupplier figureSupplier = new FigureSupplier();

       for (int i = 0; i < numberOfElements; i++) {
           randomFigure[i] = figureSupplier.getRandomFigure();
       }

       for (int i = 0; i < numberOfElements; i++) {
            randomFigure[i].drawInfo();
       }
    }
}
