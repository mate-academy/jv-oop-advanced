package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final String[] colors = new String[]{
            "rad", "green", "blue", "yellow", "black", "white"};

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
