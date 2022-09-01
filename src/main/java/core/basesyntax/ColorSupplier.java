package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length - 1);
        return String.valueOf(Color.values()[index]);
    }
}
