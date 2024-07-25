package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rand = new Random();
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        int index = rand.nextInt(colors.length);
        Color color = colors[index];
        return color.name();
    }
}
