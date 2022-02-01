package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private final static Random random = new Random();
    private final static String[] colors = {"white", "blue", "green", "black", "yellow"};

    public static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
