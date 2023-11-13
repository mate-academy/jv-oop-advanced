package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int index = random.nextInt(Colors.values().length);

    public String getRandomColor() {
        return Colors.values()[index].name();
    }
}
