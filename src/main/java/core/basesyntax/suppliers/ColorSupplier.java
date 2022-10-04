package core.basesyntax.suppliers;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        int randIndex = new Random().nextInt(colors.length);
        return colors[randIndex].name();
    }
}
