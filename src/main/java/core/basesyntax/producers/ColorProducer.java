package core.basesyntax.producers;

import core.basesyntax.constant.Color;
import java.util.Random;

public class ColorProducer {
    public static Color getColor() {
        int randomIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }
}
