package core.basesyntax.supplier;

import core.basesyntax.model.Color;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colors = Color.values();

    public String getRandomColor() {
        return new StringBuilder().append(colors[random.nextInt(colors.length)]).toString();
    }

    public String getWhiteColor() {
        return new StringBuilder().append(Color.WHITE).toString();
    }
}
