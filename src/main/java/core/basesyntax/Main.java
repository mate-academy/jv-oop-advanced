package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureProducer figureProducer = new FigureProducer();
        Figure[] figures = new Figure[new Random().nextInt(15)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureProducer.get();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
