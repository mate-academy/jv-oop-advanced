package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public static Colors getColor() {
        int randomIndex = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomIndex];
    }
}
