package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String[] colors;

    {
        colors = new String[]{"green", "yellow", "red", "blue", "black", "orange"};
    }

    public String getIndexOfColor() {
        return colors[random.nextInt(colors.length)];
    }
}
