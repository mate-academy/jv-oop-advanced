package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int indexOfColor = RANDOM.nextInt(Color.values().length - 1);
        return Color.values()[indexOfColor].name();
    }
}
