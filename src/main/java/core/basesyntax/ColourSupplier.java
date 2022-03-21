package core.basesyntax;

import java.util.Random;

public class ColourSupplier {
    public String getRandomColor() {
        Color[] values = Color.values();
        int randInt = new Random().nextInt(values.length);
        return String.valueOf(values[randInt]);
    }
}
