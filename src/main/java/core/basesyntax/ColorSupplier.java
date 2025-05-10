package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[getRandomNumber()].name();
    }

    private int getRandomNumber() {
        return random.nextInt(Color.values().length);
    }
}
