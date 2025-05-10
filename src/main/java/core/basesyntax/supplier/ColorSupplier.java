package core.basesyntax.supplier;

import core.basesyntax.model.abstraction.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int colorsQuantity = Color.values().length;
        int colorIndex = random.nextInt(colorsQuantity);
        return Color.values()[colorIndex];
    }
}
