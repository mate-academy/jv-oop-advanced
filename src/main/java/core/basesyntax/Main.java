package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

       int maximumNumberOfElements = 10;

       Random rnd = new Random();
       int numberOfElements = rnd.nextInt(maximumNumberOfElements) + 1;

       Figure[] figure = new Figure[numberOfElements];

       for (int i = 0; i < numberOfElements; i++) {
           figure[i] = FigureSupplier.getRandomFigure();
       }

       for (int i = 0; i < numberOfElements; i++) {
            figure[i].drawInfo();
       }



    }
}
