package core.basesyntax.supplier;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);
        return Color.values()[randomIndex].toString();
    }
}