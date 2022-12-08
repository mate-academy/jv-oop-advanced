package core.basesyntax.utils;

import core.basesyntax.geometry.Colors;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Colors randomColor = colors[random.nextInt(colors.length)];
        return randomColor.name();
    }
}
