package core.basesyntax;

import core.basesyntax.randomizers.FigureSupplier;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static Random numberOfFigures = new Random();
    private static int arrayLenght = numberOfFigures.nextInt(10) + 1;
    //set 10 just to easy self-test
    private static int halfOfArray = (arrayLenght + arrayLenght % 2) / 2;
    private static FigureSupplier figure = new FigureSupplier();
    private static Figure[] arrayOfFigures = new Figure[arrayLenght];

    public static void main(String[] args) {
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < halfOfArray) {
                arrayOfFigures[i] = figure.getRandomFigure();
            } else {
                arrayOfFigures[i] = figure.getDefaultFigure();
            }
        }
        for (Figure j: arrayOfFigures) {
            j.draw();
        }
    }
}
