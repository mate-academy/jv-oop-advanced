package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int numberOfColor = random.nextInt(Colors.values().length);
        return Colors.values()[numberOfColor].toString();
    }

    public Colors getDefaultColor() {
        return Colors.White;
    }
}
