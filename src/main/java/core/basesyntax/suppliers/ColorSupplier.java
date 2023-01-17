package core.basesyntax.suppliers;

import core.basesyntax.abstractAndEnum.Color;
import java.util.Random;

public class ColorSupplier {
    private int colorIndex = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[colorIndex].name();
    }
}
