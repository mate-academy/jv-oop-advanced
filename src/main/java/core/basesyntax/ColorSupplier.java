package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "pink", "white", "black", "yellow"};
    private final Random randomColor = new Random();

    public String getRandomColor() {
        return COLORS[randomColor.nextInt(COLORS.length)];
    }
}
