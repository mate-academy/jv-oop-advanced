package core.basesyntax.service;

import core.basesyntax.entity.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
