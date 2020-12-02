package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();

        int arrayRandomLength = random.nextInt(9);

        Figure[] myFigureArray = new Figure[arrayRandomLength];
        CreateFigure.getCreateFigure(myFigureArray);

        for (Figure figures : myFigureArray) {
            System.out.println(figures.drawFigure());
        }
    }
}
