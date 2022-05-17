package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = 6;

    public String getRandomColor() {
        int index = new Random().nextInt(NUMBER_OF_COLORS);
        return Color.values()[index].name();
    }

}
