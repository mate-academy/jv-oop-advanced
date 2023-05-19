package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Orange","Indigo","Gray"};
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
