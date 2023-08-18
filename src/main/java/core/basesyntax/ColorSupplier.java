package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();

    public String getRandomColor() {
        int index = new Random().nextInt(colors.length);
        return colors[index].name();
    }
}
