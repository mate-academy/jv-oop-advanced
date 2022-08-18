package core.basesyntax.suppliers;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
