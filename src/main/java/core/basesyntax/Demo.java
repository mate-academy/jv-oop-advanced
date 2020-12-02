package core.basesyntax;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(5)];
        FigureProducer figureProducer = new FigureProducer();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureProducer.get();
            printInfo(figures[i]);
        }
    }

    public static void printInfo(Figure figure) {
        figure.draw();
    }
}
