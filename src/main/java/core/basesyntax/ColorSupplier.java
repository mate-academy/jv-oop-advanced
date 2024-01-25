package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {

        int index = new Random().nextInt(ColorList.values().length);

        return String.valueOf(ColorList.values()[index]);
    }
}
