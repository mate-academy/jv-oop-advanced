package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static void getRandomColor() {
        Random random = new Random();
        int index = new Random().nextInt(Color.values().length);
    }
}
