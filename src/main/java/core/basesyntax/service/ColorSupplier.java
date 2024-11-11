package core.basesyntax.service;

import core.basesyntax.model.Color;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        Color color = colors[random.nextInt(colors.length)];
        return color.name();
    }
}
