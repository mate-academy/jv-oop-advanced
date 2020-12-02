package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public static Color getColor() {
        int randomGeneratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGeneratedIndex];
    }
}
