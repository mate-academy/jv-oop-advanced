package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private Color[] colors = Color.values();

    public String getRandomColor() {
        Color randomColor = colors[random.nextInt(colors.length)];
        return randomColor.name();
    }

    public String getDefaultColor() {
        return DEFAULT_COLOR;
    }
}
