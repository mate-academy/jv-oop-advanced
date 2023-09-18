package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final ColorEnum[] COLORS = ColorEnum.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index].toString().toLowerCase();
    }
}
