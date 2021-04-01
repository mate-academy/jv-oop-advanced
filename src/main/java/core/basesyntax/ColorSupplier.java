package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"blue", "yeLlo", "red", "purple", "green"};
    private Random random = new Random();

    public String getRandomColor() {
        int number = random.nextInt(COLORS.length);
        return COLORS[number];
    }
}
