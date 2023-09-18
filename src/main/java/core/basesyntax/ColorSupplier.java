package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index].toString().toLowerCase();
    }
}
