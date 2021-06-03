package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Colors[] values = Colors.values();
        int getRandomIndex = new Random().nextInt(Colors.values().length);
        return values[getRandomIndex].name();
    }
}
