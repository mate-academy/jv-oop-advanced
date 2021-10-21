package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] values = Color.values();
        return values[new Random().nextInt(values.length)].toString();
    }
}
