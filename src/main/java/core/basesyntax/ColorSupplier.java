package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] color = Colors.values();
        return color[random.nextInt(color.length)].name().toLowerCase();
    }
}
