package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public static final int COUNT_OF_FIGURE_IMPLEMENTATIONS = 2;

    public static Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNT_OF_FIGURE_IMPLEMENTATIONS);
        switch (randomGeneratedIndex) {
            case 0:
                return new Square();
            case 1:
            default:
                return new Rectangle();
        }
    }
}
