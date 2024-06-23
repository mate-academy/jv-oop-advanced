package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public String getRandomColor() {
        int indexRandom = RANDOM.nextInt(Color.values().length);
        return Color.values()[indexRandom].name().toLowerCase();
    }
}
