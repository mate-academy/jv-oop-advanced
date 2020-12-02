package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public Color get() {
        int colorIndex = new Random().nextInt(Color.values().length);
        return Color.values()[colorIndex];
    }
}
