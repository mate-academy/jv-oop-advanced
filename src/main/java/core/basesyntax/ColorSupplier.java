package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"blue", "red", "green", "yellow", "black"};

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
