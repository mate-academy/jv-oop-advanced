package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {

        byte colorsAmount = 5;

        String[] colors = new String[colorsAmount];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "yellow";
        colors[4] = "brown";

        Random random = new Random();

        return colors[random.nextInt(colors.length)];
    }
}
