package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"blue", "yellow", "purple", "black",
            "white", "green", "brown", "pink"};
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
