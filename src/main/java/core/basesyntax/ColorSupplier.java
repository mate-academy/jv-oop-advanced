package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private final String [] color = {
            "RED",
            "BLUE",
            "PINK",
            "PURPLE",};

    public String getRandomColor() {
        int index = random.nextInt(color.length);
        return color[index];
    }

    public String[] getColor() {
        return color.clone();
    }
}
