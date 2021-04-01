package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors
        = new String[]{"blue", "yellow", "green", "grey", "pink", "orange"};

    public String assignColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
