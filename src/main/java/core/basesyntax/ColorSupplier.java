package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"blue", "yellow", "green", "grey", "black", "purple"};
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int getIndex = RANDOM.nextInt(COLORS.length);
        return COLORS[getIndex];
    }
}
