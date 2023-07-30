package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random colorRandomizer = new Random();

    public String getRandomColor() {
        final int colorIndex = colorRandomizer.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
