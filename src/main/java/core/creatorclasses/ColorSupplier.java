package core.creatorclasses;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[] {"red", "yellow", "blue", "black",
            "grey", "white", "green", "orange"};
    private static final int COLORS_NUMBER = 7;

    private final Random rand = new Random();

    public String getRandomColor() {
        return COLORS[rand.nextInt(COLORS_NUMBER)];
    }
}
