package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"Red", "Blue", "Green", "Black", "White"};
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLORS.length);
        return COLORS[colorNumber];
    }
}
