package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int indexOfColor = random.nextInt(Color.values().length - 1);
        return Color.values()[indexOfColor].name();
    }
}
