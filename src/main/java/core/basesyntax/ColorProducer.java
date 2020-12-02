package core.basesyntax;

import java.util.Random;

public class ColorProducer {
    public static final int RANDOM_COLOR = 10;

    public Color insertRandomColor() {
        int randomGenerate = new Random().nextInt(RANDOM_COLOR);
        return Color.values()[randomGenerate];
    }
}
