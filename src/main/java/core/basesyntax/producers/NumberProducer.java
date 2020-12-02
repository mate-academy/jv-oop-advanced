package core.basesyntax.producers;

import java.util.Random;

public class NumberProducer {
    public static int getNumber() {
        return new Random().nextInt(15) + 1;
    }

    public static int getNumberListFigure() {
        return new Random().nextInt(10) + 1;
    }
}
