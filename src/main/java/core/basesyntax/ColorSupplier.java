package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color color;

    public String getRandomColor() {
        Random random = new Random();
        int randomNumberForColor = random.nextInt(Color.values().length);
        return Color.values()[randomNumberForColor].toString();
    }
}
