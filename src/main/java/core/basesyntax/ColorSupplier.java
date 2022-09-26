package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = 9;

    public String getRandomColor() {
        int index = new Random().nextInt(NUMBER_OF_COLORS);
        String result = Color.values()[index].toString();
        return result;
    }
}
