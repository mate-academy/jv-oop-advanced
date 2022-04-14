package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    Color[] colors = Color.values();
    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].toString();
    }
}
