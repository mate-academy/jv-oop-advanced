package core.basesyntax.services;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"red", "blue", "yellow", "green", "rose",
        "black", "white", "violet", "orange", "indigo"};

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
