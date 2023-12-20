package core.basesyntax;

import core.basesyntax.enums.Color;

import java.util.Random;

public class ColorSupplier {
    private int indexColor;
    private final Random random = new Random();

    public Color getRandomColor() {
        indexColor = random.nextInt(Color.values().length);
        return Color.values()[indexColor];
    }
}
