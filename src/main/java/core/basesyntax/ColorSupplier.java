package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {
            "red", "blue", "green", "yellow", " black"
    };

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
