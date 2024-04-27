package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        Color randomColor = colors[random.nextInt(colors.length)];
        return randomColor;
    }
}
