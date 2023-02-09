package core.basesyntax.service;

import core.basesyntax.entity.Color;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
