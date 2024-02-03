package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "orange", "purple"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

}
