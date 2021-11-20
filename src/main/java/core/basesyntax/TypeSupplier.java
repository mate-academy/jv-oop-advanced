package core.basesyntax;

import java.util.Random;

public class TypeSupplier {
    public String getRandomType() {
        int index = new Random().nextInt(FigureTypes.values().length);
        return FigureTypes.values()[index].toString();
    }
}
