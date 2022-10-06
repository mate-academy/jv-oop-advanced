package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color value = Color.values()[index];
        return value.toString();
    }
}
