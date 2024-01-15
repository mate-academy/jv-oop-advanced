package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private static final Random random = new Random();
    private static final String[] colors = {"white", "blue", "green", "black", "yellow"};

    public static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
