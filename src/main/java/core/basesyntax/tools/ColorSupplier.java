package core.basesyntax.tools;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorRandomIndex = new Random().nextInt(Color.values().length);
        return Color.values()[colorRandomIndex].toString();
    }
}
