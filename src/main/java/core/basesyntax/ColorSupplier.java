package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[]{"red", "green", "blue", "yellow",
            "black", "pink"};

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
