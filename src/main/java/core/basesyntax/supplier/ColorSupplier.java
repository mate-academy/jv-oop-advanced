package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    private final String[] color = {"blue", "yellow", "purple", "black",
            "white", "green", "brown", "pink"};
    private final int index = new Random().nextInt(color.length);

    public String getRandomColor() {
        return color[index];
    }
}
