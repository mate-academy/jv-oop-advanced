package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] colors = Colors.values();
    private final int size = colors.length;
    private Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(size)].name();
    }
}
