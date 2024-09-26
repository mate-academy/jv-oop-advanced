package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random random = new Random();
    private final Color[] color = Color.values();

    public static String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase();
    }
}
