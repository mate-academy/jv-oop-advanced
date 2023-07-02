package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[new Random().nextInt(colors.length)].name();
    }
}
