package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static Random random = new Random();

    public static String getRandomColor() {
        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
