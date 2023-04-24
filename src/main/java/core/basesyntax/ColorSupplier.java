package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"White","Black","Orange","Red", "Blue", "Green", "Yellow"};
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
