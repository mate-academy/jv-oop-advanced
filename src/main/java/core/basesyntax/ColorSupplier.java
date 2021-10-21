package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_COUNT = Color.values().length;

    public String getRandomColor() {
        Color randomColor = Color.values()[new Random().nextInt(COLORS_COUNT)];
        return randomColor.toString();
    }
}
