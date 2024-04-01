package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    public static final String[] COLORS = {"black", "white", "yellow", "red", "blue", "purple"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
