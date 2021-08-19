package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String [] COLORS = new String[] {"red", "blue", "white", "black", "green"};

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
