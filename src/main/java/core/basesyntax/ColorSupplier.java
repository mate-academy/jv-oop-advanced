package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        String name = Color.values()[index].name();
        return name;
    }
}
