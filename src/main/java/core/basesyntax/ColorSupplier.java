package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random colorNumber = new Random();

    public String getRandomColor() {
        int number = colorNumber.nextInt(Color.values().length);
        return Color.values()[number].name();
    }
}
