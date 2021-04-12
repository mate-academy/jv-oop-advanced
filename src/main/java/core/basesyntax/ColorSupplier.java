package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomColor = new Random();
    private static final String[] colors = new String[]{
            "black", "white", "gray",
            "yellow", "orange", "red",
            "green", "purple", "pink"
    };

    public static String choseColor() {
        return colors[randomColor.nextInt(colors.length)];
    }
}
