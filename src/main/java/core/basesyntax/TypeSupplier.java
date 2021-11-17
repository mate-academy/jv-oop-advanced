package core.basesyntax;

import java.util.Random;

public class TypeSupplier {
    private final Random random = new Random();

    public FigureType getRandomType() {
        int index = random.nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }
}
