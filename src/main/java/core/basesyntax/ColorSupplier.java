package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "black", "white"};

    public String[] getColors() {
        return COLORS;
    }

    public String getRandomColor() {
        Random random = new Random();
        int indexOfColor = random.nextInt(COLORS.length);
        return COLORS[indexOfColor];
    }

}
