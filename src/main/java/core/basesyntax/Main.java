package core.basesyntax;

import core.basesyntax.producers.FigureProducer;
import core.basesyntax.producers.NumberProducer;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[NumberProducer.getNumberListFigure()];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureProducer.get();
            System.out.println(figures[i].draw());
        }
    }
}
