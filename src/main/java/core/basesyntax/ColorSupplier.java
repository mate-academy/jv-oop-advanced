package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_QUANTITY = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int randomNumber = random.nextInt(COLORS_QUANTITY);
        return Colors.values()[randomNumber].getProperOutput();
    }
}
