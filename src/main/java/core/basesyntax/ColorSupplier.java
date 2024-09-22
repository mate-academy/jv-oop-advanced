package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "pink", "white", "black", "yellow"};

    public String getRandomColor() {
        Random randomColor = new Random();
        return COLORS[randomColor.nextInt(COLORS.length)];
    }
}
