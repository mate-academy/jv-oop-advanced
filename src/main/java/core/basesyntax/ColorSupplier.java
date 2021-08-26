package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int RANDOM_RANGE = 5;
    private Random indexOfColor = new Random();
    private String[] colors;

    {
        colors = new String[]{"green", "yellow", "red", "blue", "black", "orange"};
    }

    public String getIndexOfColor() {
        return colors[indexOfColor.nextInt(RANDOM_RANGE)];
    }
}
