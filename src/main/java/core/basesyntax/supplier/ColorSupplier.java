package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors = new String[]{"white", "blue", "yellow", "red", "green"};
        return colors[new Random().nextInt(colors.length)];
    }
}
