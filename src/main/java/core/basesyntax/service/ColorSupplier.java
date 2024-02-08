package core.basesyntax.service;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}
