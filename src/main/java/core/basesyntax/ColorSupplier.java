package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[] {"red", "green", "blue",
                                                         "black", "white", "purple"};

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
