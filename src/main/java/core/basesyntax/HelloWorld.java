package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier randomFigure = new FigureSupplier(); // figure must be random
        Figure[] figures = new Figure[random.nextInt(20)];
        // create random figure array and draw each figure
        for (int figureIndex = 0; figureIndex < figures.length; figureIndex++) {
            figures[figureIndex] = randomFigure.getRandomFigure();
            System.out.println(figures[figureIndex].getPresentation());
        }
    }
}
