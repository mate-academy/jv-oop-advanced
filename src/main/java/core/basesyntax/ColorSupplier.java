package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length);
        Color value = Color.values()[colorIndex];
        return value.toString();
    }
}
