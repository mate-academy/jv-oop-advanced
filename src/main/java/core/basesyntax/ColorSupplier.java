package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String[] FIGURE_COLOR = new String[] {"blue", "yellow", "green", "black",
            "violate", "grey"};
    private Random random = new Random();

    public String getRandomColor() {
        return FIGURE_COLOR[random.nextInt(FIGURE_COLOR.length)];
    }
}
