package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "yellow",
            "orange", "black", "white" };
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
