package core.basesyntax.suppliers;

import core.basesyntax.abstractandenum.Color;
import java.util.Random;

public class ColorSupplier {
    private final int colorIndex = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[colorIndex].name();
    }
}
