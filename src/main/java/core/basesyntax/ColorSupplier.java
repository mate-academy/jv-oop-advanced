package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[]{"Red", "Yellow", "Blue"};
    private final Random random = new Random();

    public String getRandomColor() {
        return this.colors[this.random.nextInt(colors.length)];
    }
}
