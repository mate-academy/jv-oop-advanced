package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public static Color getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(8)];
    }
}
