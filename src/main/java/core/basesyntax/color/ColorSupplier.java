package core.basesyntax.color;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        int randTemp = random.nextInt(colors.length);
        return colors[randTemp].name();
    }
}
