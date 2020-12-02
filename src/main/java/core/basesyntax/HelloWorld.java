package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static final int RANDOM_NUMBER = 5;

    public static void main(String[] args) {
        Random random = new Random();
        FigureProducer figureProducer = new FigureProducer();
        Figure[] myFigureArray = new Figure[random.nextInt(RANDOM_NUMBER)];

        for (int i = 0; i < myFigureArray.length; i++) {
            myFigureArray[i] = figureProducer.insertRandomFigure();
        }

        for (Figure figure : myFigureArray) {
            System.out.println(figure.drawFigure());
        }
    }
}
