package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final String[] colors = new String[] {
            "red", "blue", "white", "brown", "green", "pink", "yellow", "orange"
    };

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
