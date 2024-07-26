package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random RANDOM = new Random();
        Color[] colors = Color.values();
        return colors[RANDOM.nextInt(colors.length)].name();
    }
}
