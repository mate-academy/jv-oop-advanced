package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        return String.valueOf(colors[new Random().nextInt(Color.values().length)]);
    }
}
