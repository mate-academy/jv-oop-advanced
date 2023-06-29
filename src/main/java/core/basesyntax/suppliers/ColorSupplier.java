package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int colorsAmount = Color.values().length;
        int randomIndex = new Random().nextInt();
        return Color.values()[randomIndex];
    }
}