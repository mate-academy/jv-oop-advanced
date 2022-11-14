package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color [] value = Color.values();
        return value[random.nextInt(value.length)].name();
    }
}
