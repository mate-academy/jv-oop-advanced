package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int indexRandom = random.nextInt(Color.values().length);
        return Color.values()[indexRandom].name().toLowerCase();
    }
}
