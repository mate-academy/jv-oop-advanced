package core.basesyntax;

import java.util.Random;

public class  ColorSupplier {
    private static final int COLOR_AMOUNT = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_AMOUNT);
        return Color.values()[colorNumber].name();
    }
}

