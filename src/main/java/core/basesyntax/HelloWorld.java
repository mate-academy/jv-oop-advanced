package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random(); // we need to generate an array number of objects in the array is  unknown
        FigureSupplier randomFigure = new FigureSupplier(); // figure must be random
        Figure[] figures = new Figure[random.nextInt(20)]; // we need to generate an array of figures with random parameters, number of objects in the array is also unknown
        // create random figure array and draw each figure
        for (int figureIndex = 0; figureIndex < figures.length; figureIndex++ ) {
            figures[figureIndex] = randomFigure.getRandomFigure();
            System.out.println(figures[figureIndex].presentation);
        }
    }
}