package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureProducer figureProducer = new FigureProducer();
        for (int i = 0; i < new Random().nextInt(1000); i++) {
            figureProducer.get().getInfo();
        }
    }
}
