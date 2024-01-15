package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colorList =
            new String[]{"yellow", "orange", "blue", "white", "black", "brown", "purple", "green"};

    public static String getRandomColor() {
        return colorList[new Random().nextInt(colorList.length - 1)];
    }
}
