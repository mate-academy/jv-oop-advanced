package core.basesyntax.supplier;

import core.basesyntax.Color;

import java.util.Random;

public class ColorSupplier {
    private final Random RANDOM = new Random();

    public String getRandomColor() {
        int index = RANDOM.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
