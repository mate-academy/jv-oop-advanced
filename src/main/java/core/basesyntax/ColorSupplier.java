package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int indexRandom = random.nextInt(Color.values().length);
        return Color.values()[indexRandom].name().toLowerCase();
    }
}
