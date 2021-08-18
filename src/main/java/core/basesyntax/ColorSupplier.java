package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();

    public Color getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
