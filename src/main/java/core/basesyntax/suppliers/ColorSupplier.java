package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random randColor = new Random();

    public Color getRandomColor() {
        return Color.values()[randColor.nextInt(Color.values().length)];
    }
}
