package core.basesyntax;

import java.util.Random;

final class ColorSupplier {
    private final Random randomGen = new Random();
    private final Color[] colors = Color.values();
    private final int numOfColor = colors.length;

    ColorSupplier() {
        // Pure utility class, do NOT instantiate. Intended to be initialized by FigureSupplier
    }

    Color getRandomColor() {
        return colors[randomGen.nextInt(numOfColor)];
    }
}
