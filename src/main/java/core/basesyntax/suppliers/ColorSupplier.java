package core.basesyntax.suppliers;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    public String getColor() {
        return Color.WHITE.name();
    }

    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length - 1);
        return Color.values()[colorIndex].name();
    }
}
