package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureProducer figureProd = new FigureProducer();
        Figure[] figur = new Figure[new Random().nextInt(15)];

        for (int i = 0; i < figur.length; i++) {
            figur[i] = figureProd.getFigure();
            figur[i].getDraw();
        }
    }
}
