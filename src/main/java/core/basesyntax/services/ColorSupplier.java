package core.basesyntax.services;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[]{"red", "blue", "yellow", "green", "rose",
        "black", "white", "violet", "orange", "indigo"};

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
