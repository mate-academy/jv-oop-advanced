package core.basesyntax;

import java.util.Random;

public class TypeSupplier {
    Random random = new Random();

    public String getRandomType() {
        int index = random.nextInt(FigureTypes.values().length);
        return FigureTypes.values()[index].toString();
    }
}
