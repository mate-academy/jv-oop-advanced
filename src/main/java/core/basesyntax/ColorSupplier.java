package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }

    public static String setColor(String color) {
        color = Color.WHITE.name();
        return color;
    }
}
