package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rand = new Random();
    private final String[] colors = new String[]{"white", "black", "blue", "red"};

    public String getRandomColor() {
        return colors[rand.nextInt(colors.length)];
    }

    public String getDefaultColor() {
        return "white";
    }
}
