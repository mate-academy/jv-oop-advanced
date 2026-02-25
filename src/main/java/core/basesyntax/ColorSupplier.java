package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public String getRandomColor() {
        return Color.values()[RANDOM.nextInt(Color.values().length)].name();
    }
}
