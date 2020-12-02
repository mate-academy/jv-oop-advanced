package core.basesyntax;

import java.util.Random;

public class Demo {
    static final int sizeOfArrayForFigures = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(sizeOfArrayForFigures)];
        FigureProducer figureProducer = new FigureProducer();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureProducer.get();
            figures[i].draw();
        }
    }
}
