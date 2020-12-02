package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public Color get() {
        int randomIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }
}
