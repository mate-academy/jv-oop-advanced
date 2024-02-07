package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int lengthEnumColor = Color.values().length;
        return Color.values()[random.nextInt(lengthEnumColor)];
    }
}
