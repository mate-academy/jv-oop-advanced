package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"red","blue", "yellow", "green", "orange", "purple"};
    private final Random random = new Random();

    public String getRendomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
