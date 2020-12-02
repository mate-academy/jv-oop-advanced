package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    protected Color getRandomColor() {
        int randomGeneratedColor = new Random().nextInt(Color.values().length);
        return Color.values()[randomGeneratedColor];
    }
}
