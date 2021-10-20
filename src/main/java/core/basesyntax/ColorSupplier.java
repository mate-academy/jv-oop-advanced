package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] color = Color.values();
        int index = new Random().nextInt(color.length);
        return color[index].toString().toLowerCase();
    }
}
