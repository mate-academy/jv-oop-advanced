package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static String[] COLORS = new String[] { "blue", "yellow",
            "red", "black", "pink", "orange", "white" };
    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }

}
