package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] color = Color.values();
        return color[random.nextInt(color.length)].name().toLowerCase();
    }
}
