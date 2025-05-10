package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = Color.values().length;
        String colour = (Color.values()[random.nextInt(index)].name());
        return colour;
    }
}
