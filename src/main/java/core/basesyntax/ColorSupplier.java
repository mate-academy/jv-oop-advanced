package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase();
    }
}
