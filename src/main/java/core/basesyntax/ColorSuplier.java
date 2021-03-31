package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private static String[] colors = new String[] {"black", "white", "yellow",
            "blue", "red", "pink", "green", "gray"};

    public static String randomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
