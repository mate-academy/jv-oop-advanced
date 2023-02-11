package core.basesyntax.supplier;

import core.basesyntax.color.Color;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
