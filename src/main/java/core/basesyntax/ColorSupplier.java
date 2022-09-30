package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {

    Color getRandomColor() {
        Random randomGenerator = new Random();
        Color[] colors = Color.values();
        int numOfColor = colors.length;
        return colors[randomGenerator.nextInt(numOfColor)];
    }
}
