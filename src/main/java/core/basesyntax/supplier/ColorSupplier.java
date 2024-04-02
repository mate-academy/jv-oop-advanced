package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    public static final String[] COLORS = {"black", "white", "yellow", "red", "blue", "purple"};
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
