package core.basesyntax;

import java.util.Random;
import core.basesyntax.enums.Color;

public class ColorSupplier {
    private int indexColor;
    private final Random random = new Random();

    public Color getRandomColor() {
        indexColor = random.nextInt(Color.values().length);
        return Color.values()[indexColor];
    }
}
