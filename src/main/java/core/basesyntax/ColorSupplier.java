package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getColor() {
        int randomIndex = new Random().nextInt(Color.values().length);

        return Color.values()[randomIndex];
    }
}
