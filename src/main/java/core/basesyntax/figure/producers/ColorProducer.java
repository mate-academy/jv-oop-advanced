package core.basesyntax.figure.producers;

import core.basesyntax.color.Color;
import java.util.Random;

public class ColorProducer {

    public static Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }

}
