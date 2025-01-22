package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected static final int NUMBER_OF_COLORS = Color.values().length;
    protected Random random = new Random();

    protected String getRandomColor() {
        int randomNumber = random.nextInt(NUMBER_OF_COLORS);
        return Color.values()[randomNumber].name().toLowerCase();
    }
}
