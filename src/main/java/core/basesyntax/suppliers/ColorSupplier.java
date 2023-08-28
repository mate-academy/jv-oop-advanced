package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random randomColorIndex = new Random();

    public String getRandomColor() {
        int index = randomColorIndex.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
