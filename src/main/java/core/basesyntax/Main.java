package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Figure[] figure = new Figure[new Random().nextInt(10)];
        FigureProducer figureProducer = new FigureProducer();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figureProducer.getFigure();
            figure[i].drawFigure();
        }
    }
}
