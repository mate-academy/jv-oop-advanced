package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureProducer figureProducer = new FigureProducer();
        int temptFate = -1;
        while (temptFate < 0) {
            temptFate = random.nextInt(100);
        }
        Figure[] arr = new Figure[temptFate];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = figureProducer.get();
        }
        for (Figure i: arr) {
            printLine(i);
        }
    }

    public static void printLine(Figure figure) {
        System.out.println(figure.draw());
    }

}
