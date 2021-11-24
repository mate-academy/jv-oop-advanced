package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_INDEX = Color.values().length;
    private Random random = new Random();
    private Color randomColor;

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(COLOR_INDEX);
        return String.valueOf(randomColor = Color.values()[random.nextInt(Color.values().length)]);
    }
}
