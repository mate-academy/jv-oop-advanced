package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();

    public Color getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
