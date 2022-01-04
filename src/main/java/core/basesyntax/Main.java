package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int Maximum_Number_Of_Elements_In_Array = 10;
        int numberOfElements = new Random().nextInt(Maximum_Number_Of_Elements_In_Array) + 1;
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
