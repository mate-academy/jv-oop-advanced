package core.basesyntax;

import java.util.Random;

public class FigureTypeSupplier {
    private Random random = new Random();

    public FigureType getRandomFigureType() {
        int index = random.nextInt(0, FigureType.values().length);
        return FigureType.values()[index];
    }
}
