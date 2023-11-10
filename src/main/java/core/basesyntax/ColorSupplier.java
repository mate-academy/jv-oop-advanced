package core.basesyntax;

import core.basesyntax.model.enums.Color;
import java.util.Random;

public class ColorSupplier {

    public Color getRandomColor() {
        Color[] values = Color.values();
        return values[new Random().nextInt(values.length)];
    }
}
