package core.basesyntax.supplier;

import core.basesyntax.figure.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
