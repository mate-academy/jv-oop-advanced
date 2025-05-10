package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int colorsAmount = Color.values().length;
        int randomIndex = random.nextInt(colorsAmount);
        return Color.values()[randomIndex];
    }
}
