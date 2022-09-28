package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomGen = new Random();
    private final Color[] colors = Color.values();
    private final int numOfColor = colors.length;

    public Color getRandomColor() {
        return colors[randomGen.nextInt(numOfColor)];
    }
}
