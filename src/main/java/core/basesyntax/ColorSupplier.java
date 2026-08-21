package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorCount = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colorCount);
        return Color.values()[index].name();
    }
}
