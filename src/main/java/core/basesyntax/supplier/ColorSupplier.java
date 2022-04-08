package core.basesyntax.supplier;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random;

    public String getRandomColor() {
        random = new Random();
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
