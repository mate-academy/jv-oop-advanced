package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static String color;

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        ColorSupplier.color = color;
    }

    public static String getRandomColor() {

        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "yellow";
        colors[4] = "brown";

        Random random = new Random();
        setColor(colors[random.nextInt(5)]);

        return color;
    }
}
