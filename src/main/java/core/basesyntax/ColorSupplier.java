package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        int randIndex = new Random().nextInt(colors.length);
        return colors[randIndex].name();
    }
}
