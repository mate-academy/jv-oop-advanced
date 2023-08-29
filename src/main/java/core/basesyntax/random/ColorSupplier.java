package core.basesyntax.random;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase();
    }

    public String getDefaultColor() {
        return Color.WHITE.name().toLowerCase();
    }
}
