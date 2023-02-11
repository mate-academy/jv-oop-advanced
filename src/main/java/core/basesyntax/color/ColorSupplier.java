package core.basesyntax.color;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
