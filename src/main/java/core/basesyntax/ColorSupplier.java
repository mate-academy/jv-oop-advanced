package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"blue", "red", "green", "yellow", "pink", "brown"};

    public static String getRandomColor() {
        Random randomColors = new Random();
        return COLORS[randomColors.nextInt(COLORS.length)];
    }
}
