package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(RandomColor.values().length);
        RandomColor randomColor = RandomColor.values()[index];
        return randomColor.toString();
    }
}
