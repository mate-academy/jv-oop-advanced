package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final String[] colors = {
            "red", "blue", "green", "yellow", "pink", "orange", "pink"};
    private static final int colorCount = colors.length;
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int colorIndex = random.nextInt(colorCount);
        return colors[colorIndex];
    }
}
