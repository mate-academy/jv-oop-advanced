package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public Color getRandom() {
        int randomGenaratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGenaratedIndex];
    }
}
