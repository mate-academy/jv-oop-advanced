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
        Figure[] figures = new Figure[temptFate];
        for (Figure figure: figures) {
            figure = figureProducer.get();
            System.out.println(figure.draw());
        }
    }
}
