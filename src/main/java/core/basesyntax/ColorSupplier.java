package core.basesyntax;

import java.util.Random;

//for generating random color
public class ColorSupplier {
    private static final String[] colors = {"red", "yellow", "grey", "black", "pink"};

    public static String getRandomColor() {
        int randomColor = new Random().nextInt(colors.length);
        return colors[randomColor];
    }
}
