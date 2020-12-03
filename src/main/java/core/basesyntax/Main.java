package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        FigureProducer figureProducer = new FigureProducer();
        Figure[] figures = new Figure[new Random().nextInt(10)];

        for (Figure figure: figures) {
            figure = figureProducer.get();
            System.out.println(figure.draw());
        }
    }
}
