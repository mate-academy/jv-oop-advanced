package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[new Random().nextInt(Color.values().length)];
    }
}
