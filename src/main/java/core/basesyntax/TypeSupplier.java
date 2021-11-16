package core.basesyntax;

import java.util.Random;

public class TypeSupplier {
    public String getRandomType() {
        int index = new Random().nextInt(Figures.values().length);
        return Figures.values()[index].toString();
    }
}
