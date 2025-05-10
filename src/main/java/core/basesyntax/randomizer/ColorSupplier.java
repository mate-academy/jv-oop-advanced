package core.basesyntax.randomizer;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
