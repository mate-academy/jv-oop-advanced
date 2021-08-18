package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int MAX_NUMBER_OF_COLOR = 8;
    private Random random = new Random();
    private static final String[] COLORS = new String[] {"yellow", "red", "green", "blue",
            "cyan", "gray", "magenta", "black"};

    public String getRandomColor() {
        int colorNumber = random.nextInt(MAX_NUMBER_OF_COLOR);
        return COLORS[colorNumber];
    }
}
